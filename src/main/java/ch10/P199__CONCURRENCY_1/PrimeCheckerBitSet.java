package ch10.P199__CONCURRENCY_1;

import java.util.BitSet;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class PrimeCheckerBitSet extends PrimeChecker {

    private static final AtomicInteger curMax = new AtomicInteger();
    protected AtomicInteger getCurMax(){ return curMax;}

    private final static BitSet nonPrimesBitSet = new BitSet();

    private final static Set<Integer> primes = new ConcurrentSkipListSet<>();

    protected Set<Integer> getPrimes() {
        return primes;
    }

    protected Set<Integer> getSieve() {
        return nonPrimesBitSet.stream().boxed().collect(Collectors.toSet());
    }

    protected synchronized Set<Integer> updatePrimesSet(int n) {
        for (int p = 2; p <= n; p = nonPrimesBitSet.nextClearBit(p + 1)) {
            for (int i = p * p; i <= n; i += p)
                nonPrimesBitSet.set(i);
            primes.add(p);
        }
        return primes;
    }
}
