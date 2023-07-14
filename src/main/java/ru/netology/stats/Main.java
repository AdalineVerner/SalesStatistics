package ru.netology.stats;


public class Main {
    public static void main(String[] args) {
        int[] sales = new int[12];
        StatsService service = new StatsService();

        int total = service.totalSum(sales);
        System.out.println(total);

        int average = service.averageSum(sales);
        System.out.println(average);

        int max = service.maxSales(sales);
        System.out.println(max);

        int min = service.minSales(sales);
        System.out.println(min);

        int countBelow = service.belowAverageMonth(sales);
        System.out.println(countBelow);

        int countDegree = service.degreeAverageMonth(sales);
        System.out.println(countDegree);
    }
}