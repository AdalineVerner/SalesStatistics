package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test

    public void shouldFindTotalSum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedTotal = 180;
        int actualTotal = service.totalSum(sales);

        Assertions.assertEquals(expectedTotal, actualTotal);
    }

    @Test
    public void shouldFindAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAverage = 15;
        int actualAverage = service.averageSum(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test

    public void shouldFindMaxSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxSales = 8;
        int actualMaxSales = service.maxSales(sales);

        Assertions.assertEquals(expectedMaxSales, actualMaxSales);
    }

    @Test

    public void shouldFindMinSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinSales = 9;
        int actualMinSales = service.minSales(sales);

        Assertions.assertEquals(expectedMinSales, actualMinSales);

    }

    @Test

    public void shouldFindBelowAverageMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedBelowAverageMonth = 5;
        int actualBelowAverageMonth = service.belowAverageMonth(sales);

        Assertions.assertEquals(expectedBelowAverageMonth, actualBelowAverageMonth);

    }

    @Test

    public void shouldFindDegreeAverageMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedDegreeAverageMonth = 5;
        int actualDegreeAverageMonth = service.belowAverageMonth(sales);

        Assertions.assertEquals(expectedDegreeAverageMonth, actualDegreeAverageMonth);


    }


}
