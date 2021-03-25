package ru.netology.stats;

public class StatsService {

    private long average;
    private long sum;

    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public long findAverage(long[] purchases) {
        long average = calculateSum(purchases) / purchases.length;
        return average;
    }

    public long findMax(long[] purchases) {
        long max = purchases[0];
        long month = 0;
        for (int i = 0; i < purchases.length; i++) {
            long score = purchases[i];
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
        for (int i = 0; i < purchases.length; i++) {
            long score = purchases[i];
            if (min >= score) {
                min = score;
                month = i;
            }
        }
        return month + 1;
    }

    public long countBelowAverage(long[] purchases) {
        long countBelow = 0;
        for (long purchase : purchases) {
            if (purchase < findAverage(purchases)) {
                countBelow++;
            }
        }
        return countBelow;
    }

    public long countAboveAverage(long[] purchases) {
        long countAbove = 0;
        for (long purchase : purchases) {
            if (purchase > findAverage(purchases)) {
                countAbove++;
            }
        }
        return countAbove;
    }

    public void setAverage(long average) {
        this.average = average;
    }
}