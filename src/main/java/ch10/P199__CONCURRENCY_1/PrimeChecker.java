package ch10.P199__CONCURRENCY_1;

import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;

public abstract class PrimeChecker {

    protected static final Logger logger = Logger.getLogger(PrimeChecker.class.getName());

    protected boolean isPrime(Integer num) {
        if (getCurMax().get() >= num) {
            //use the sieve calculated earlier
            boolean isPrime = getPrimes().contains(num);
            var logMsg = "" + num + (isPrime ? " - it's a PRIME" : " - it's NOT a prime");
            logger.fine(() -> "Cons-thread [" + Thread.currentThread().getName() + "] " +
                    "PRECALCULATED sieve for NUM " + num + logMsg);
            return isPrime;
        } else {
            //need to update the sieve
            /**
             * Если у нас такой сценарий: Допустим, текущее значение curMax=5, и приходят 2 потока A и B.
             *   Поток A со значением 20, а поток B со значением 10.
             *   Поток A понимает, что curMax < 20, устанавливает новый curMax=20, но еще не начал работу по вычислению чисел.
             * В это время поток B делает проверку, понимает, что curMax, который теперь равен 20, больше n,
             * и считает, что ничего вычислять не надо - все уже готово и можно использовать сохраненный результат,
             * которого еще нет, так как поток A свою работу не закончил
             * */

            updatePrimesSet(num);
            boolean updated = getCurMax().compareAndSet(getCurMax().getPlain(), num);
//            // обновляем curMax исходя из его значения на текущий момент - через CAS
            if (!updated && getCurMax().get() < num) {
                getCurMax().compareAndSet(getCurMax().get(), num);
            }

            boolean isPrime = getPrimes().contains(num);
            logger.info(() -> "Cons-thread: " + Thread.currentThread().getName() + ": " +
                    "UPDATING the sieve for NUM " + num);
            return isPrime;
        }
    }

    protected abstract Set<Integer> getPrimes();
    protected abstract Set<Integer> getSieve();

    protected abstract Set<Integer> updatePrimesSet(int n);

    protected abstract AtomicInteger getCurMax();
}
