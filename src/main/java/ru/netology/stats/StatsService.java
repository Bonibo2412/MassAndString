package ru.netology.stats;

public class StatsService {

    public int allSales(int[] amounts) {
        int sum = 0;
        for (int amount : amounts) {
            sum += amount;
        }
        return sum;
    }

    public int averageSales(int[] amounts) {
        return allSales(amounts) / amounts.length;
    }

    public int calcMonthMaxSale(int[] amounts) {
        int monthMaxSales = 0;
        for (int i = 0; i < amounts.length; i++) {
            if (amounts[i] >= amounts[monthMaxSales]) {
                monthMaxSales = i;
            }

        }
        return monthMaxSales + 1;
    }

    public int calcMonthMinSale(int[] amounts) {
        int monthMinSales = 0;
        for (int i = 0; i < amounts.length; i++) {
            if (amounts[i] <= amounts[monthMinSales]) {
                monthMinSales = i;
            }

        }
        return monthMinSales + 1;

    }

    public int calcMonthsWithSalesBelowAverage(int[] amounts) {
        int counter = 0;
        int average = averageSales(amounts);
        for (int amount : amounts) {
            if (amount < average) {
                counter++;
            }
        }
        return counter;
    }

    public int calcMonthsWithSalesAboveAverage(int[] amounts) {
        int counter = 0;
        int average = averageSales(amounts);
        for (int amount : amounts) {
            if (amount >= average) {
                counter++;
            }
        }
        return counter;
    }
}



