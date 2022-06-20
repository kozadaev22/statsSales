import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldSumSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.sumSales(sales);
        int expected = 180;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindAveSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.aveSales(sales);
        int expected = 15;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldFindMaxMonthSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.maxSalesMonth(sales);
        int expected = 8;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldFindMinMonthSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.minSalesMonth(sales);
        int expected = 9;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldCountMinAveMonthSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.minAveMonthSales(sales);
        int expected = 5;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldCountMaxAveMonthSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.maxAveMonthSales(sales);
        int expected = 5;
        Assertions.assertEquals(actual, expected);
    }


}

