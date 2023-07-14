package ru.netology.stats;

public class StatsService {
    public int totalSum(int[] sales) {
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }

    public int averageSum(int[] sales) {
        int average = totalSum(sales) / 12;
        return average;
    }

    public int maxSales(int[] sales) {
        int max = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[max]) {
                max = i;
            }

        }
        return max + 1;
    }

    public int minSales(int[] sales) {
        int min = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[min]) {
                min = i;
            }
        }
        return min + 1;
    }

    public int belowAverageMonth(int[] sales) {
        int countBelow = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSum(sales)) {
                countBelow++;
            }
        }
        return countBelow;
    }

    public int degreeAverageMonth(int[] sales) {
        int countDegree = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSum(sales)) {
                countDegree++;
            }
        }
        return countDegree;
    }
}
