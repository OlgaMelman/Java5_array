package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {


    @Test
    public void countSumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSum = 180;
        long actualSum = service.sumAllSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void countMidSumSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMidSale = 12;
        long actualMidSale = service.midSumSale(sales);

        Assertions.assertEquals(expectedMidSale, actualMidSale);
    }

    @Test
    public void countMaxSumMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxSale = 8;
        int actualMaxSale = service.maxSumMonth(sales);

        Assertions.assertEquals(expectedMaxSale, actualMaxSale);
    }

    @Test
    public void countMinSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinSale = 9;
        int actualMinSale = service.minSales(sales);

        Assertions.assertEquals(expectedMinSale, actualMinSale);
    }

    @Test
    public void countMonthsDownMidSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonthDown = 5;
        int actualMonthDown = service.monthsDownMidSales(sales);

        Assertions.assertEquals(expectedMonthDown, actualMonthDown);
    }

    @Test
    public void countMonthsUpMidSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonthUp = 5;
        int actualMonthUp = service.monthsUpMidSales(sales);

        Assertions.assertEquals(expectedMonthUp, actualMonthUp);
    }
}
