import java.util.Arrays;

public class StatsService {
    public int sumSales(int[] sales) {
        int salesX = 0;
        for (int y : sales) {
            salesX += y;
        }
        return salesX;
    }

    public int aveSales(int[] sales) {
        int aveSale = sumSales(sales);
        return aveSale / sales.length; // тут я предположил, что java может ср.знач считать сама (случайно натыкал)
    }

    public int maxSalesMonth(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i = i + 1) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSalesMonth(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i = i + 1) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int minAveMonthSales(int[] sales) {
        int minAveSale = aveSales(sales);
        int count = 0;
        for (int y : sales) {
            if (y < minAveSale) {
                count = count + 1;
            }
        }
        return count;
    }

    public int maxAveMonthSales(int[] sales) {
        int maxAveSale = aveSales(sales);
        int count = 0;
        for (int y : sales) {
            if (y > maxAveSale) {
                count = count + 1;
            }
        }
        return count;
    }



}

