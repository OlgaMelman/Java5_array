package ru.netology.stats;

import java.sql.SQLOutput;

public class StatsService {

    public long sumAllSales(long[] sales) {
        long sumSales = 0;
        for (long sale : sales) {
            sumSales += sale;
        }
        return sumSales;
    }

    public long midSumSale(long[] sales) {
        long sumSales = sumAllSales(sales);
        long midSales = sumSales / sales.length;

        return midSales;
    }

    public int maxSumMonth(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month += 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month += 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }


    public int monthsDownMidSales(long[] sales) {
        long midSales = midSumSale(sales);
        int numberMonths = 0 ;
        for ( long sale: sales) {
            if (sale < midSales) {
                numberMonths += 1;
            }
        }
        return numberMonths;
    }

    public int monthsUpMidSales(long[] sales) {
        long midSales = midSumSale(sales);
        int numberMonths = 0 ;
        for ( long sale: sales) {
            if (sale > midSales) {
                numberMonths += 1;
            }
        }
        return numberMonths;
    }

}
