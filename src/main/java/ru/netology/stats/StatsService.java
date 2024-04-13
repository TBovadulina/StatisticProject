package ru.netology.stats;

public class StatsService {
    public long sumSales(long[] sales) {
        long sum = 0; // сумма всех продаж

        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public long averageSumSalesPerMonth(long[] sales) {
        long sum = sumSales(sales);
        long average = sum / sales.length; //средняя сумма продаж в месяц

        return average;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public long monthBelowAverage(long[] sales) {
        long sumAverage = averageSumSalesPerMonth(sales); // количество месяцев, в которых продажи были ниже среднего
        int belowAverage = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[sumAverage]) {
                belowAverage += 1;
            }
        }
        return belowAverage;
    }

    public int monthAboveAverage(long[] sales) {
        long sAverage = averageSumSalesPerMonth(sales); // количество месяцев, в которых продажи были выше среднего
        int aboveAverage = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[sAverage]) {
                aboveAverage += 1;
            }
        }
        return aboveAverage;
    }
}

