package ch10.P199__CONCURRENCY_1;

import java.util.BitSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.stream.Collectors;

public class SimpleSieve {
    /**
     * Во входном файле записаны целые числа через пробел.
     * Реализовать считывание чисел из файла, и для каждого числа выполнить проверку на простоту,
     * используя решето Эратосфена (решето должно быть в единственном эксемпляре и динамически меняться).
     * Обработка массива чисел - в параллельном режиме (количество потоков задаётся через параметр командной строки).
     *
     * Небольшое пояснение:
     * решето должно быть единственное и строиться для максимального из всех которые на данный момент были обработаны.
     * */
    private static BitSet nonPrimesBitSet = new BitSet();
    private static Set<Integer> primesSet = new ConcurrentSkipListSet<>();


    private static Set<Integer> primesOnBitSet(int n){
        for (int p = 2; p <= n ; p = nonPrimesBitSet.nextClearBit(p+1)) {
            for (int i = p * p; i <= n; i += p)
                nonPrimesBitSet.set(i);
            primesSet.add(p);
        }
        return primesSet;
    }

    private static NavigableSet<Integer> primesNavSet = new ConcurrentSkipListSet<>();
    public static Set<Integer> primesOnTreeSet(int n) {

        if (n < 2) return primesNavSet; //no change
        primesNavSet.add(2);
        int last = 3;
        for (int i = last; i <= n; i += 2){
            primesNavSet.add(i);
        }
        return filterSet(last, n);
    }

    private static NavigableSet<Integer> filterSet(int last, int n) {
        int squared = last * last;
        if (squared < n) {
            for(int i=squared; i <= n; i += last) {
                primesNavSet.remove(i);
            }
            return filterSet( primesNavSet.higher(last), n);
        }
        return primesNavSet;
    }


    public static void main(String[] args) {

        System.out.println(primesOnBitSet(120).stream().map(e->""+e).collect(Collectors.joining(" ")));
        System.out.println("-------------");
        System.out.println(primesOnTreeSet(120).stream().map(e->""+e).collect(Collectors.joining(" ")));
    }
}
