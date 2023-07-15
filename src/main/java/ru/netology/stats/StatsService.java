package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }

        return totalSale;
    }

    public long average(long[] sales) {
        return sum(sales) / sales.length;

    }

    public int monthMax(long[] sales) {
        int monthResult = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthResult]) {
                monthResult = i;

            }
        }
        return monthResult + 1;
    }

    public int monthMin(long[] sales) {
        int monthResult = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthResult]) {
                monthResult = i;

            }
        }
        return monthResult + 1;

    }

    public int monthsBelowAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;
    }

    public int monthsAboveAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;
            }
        }
        return counter;
    }
}


