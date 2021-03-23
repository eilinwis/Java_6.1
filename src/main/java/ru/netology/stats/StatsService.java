package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            // аналог sum = sum + purchase;
            sum += purchase;
        }
        return sum;
    }

    public long findAverage(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            // аналог sum = sum + purchase;
            sum += purchase;
            //long average = sum / purchases.length;
        }
        long average = sum / purchases.length;
        ;
        return average;
    }

    public long findMax(long[] purchases) {
        long max = purchases[0];
        long month = 0;
        for (long i = 0; i < purchases.length; i++) {
            long score = purchases[(int) i];
            if (max <= score) {
                max = score;
                month = i;
            }
        }
        return month + 1;
    }

    public long findMin(long[] purchases) {
        long min = purchases[0];
        long month = 0;
        for (long i = 0; i < purchases.length; i++) {
            long score = purchases[(int) i];
            if (min >= score) {
                min = score;
                month = i;
            }
        }
        return month + 1;
    }

    public long countBelowAverage(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        long average = sum / purchases.length;
        long countBelow = 0;
        for (long purchase : purchases) {
            if (purchase < average){
                countBelow++;
            }
        }
        return countBelow;
    }
    public long countAboveAverage(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        long average = sum / purchases.length;
        long countAbove = 0;
        for (long purchase : purchases) {
            if (purchase > average){
                countAbove++;
            }
        }
        return countAbove;
    }
}

