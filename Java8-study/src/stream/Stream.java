package stream;

import java.util.stream.LongStream;

public class Stream {

    public static void main(String[] args) {

        int tc = 10;
        while(tc-->0) {
            parallel();
        }
    }

    private static void parallel() {
        long start = System.currentTimeMillis();
        long sum = LongStream.range(0, 1_000_000).parallel()
                .sum();
        // System.out.println(sum);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

    private static void single() {
        long start = System.currentTimeMillis();
        long sum = LongStream.range(0, 1_000_000).sum();
        // System.out.println(sum);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

    private static void forLoop() {
        long start = System.currentTimeMillis();
        long sum = 0L;
        for(long i=0; i<1_000_000; i++) {
            sum+=i;
        }
        // System.out.println(sum);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
