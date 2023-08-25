package ch10.P199__CONCURRENCY_1;

import java.util.NavigableSet;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.atomic.AtomicInteger;

public class PrimeCheckerTailrec extends PrimeChecker{

    private static final AtomicInteger curMax = new AtomicInteger();
    protected AtomicInteger getCurMax(){ return curMax;}

    private final static NavigableSet<Integer> primes = new ConcurrentSkipListSet<>();

    protected Set<Integer> getPrimes(){
        return primes;
    }

    protected Set<Integer> getSieve(){
        throw new UnsupportedOperationException();
    }
    protected Set<Integer> updatePrimesSet(int n) {

        if (n < 2) return primes;
        primes.add(2);
        int last = 3;
        for (int i = last; i <= n; i += 2) {
            primes.add(i);
        }
        return filterSet(last, n);
    }

    private NavigableSet<Integer> filterSet(int last, int n) {
        int squared = last * last;
        if (squared < n) {
            for (int i = squared; i <= n; i += last) {
                primes.remove(i);
            }
            return filterSet(primes.higher(last), n);
        }
        return primes;
    }
}
