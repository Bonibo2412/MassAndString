import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {
    @Test
    public void testAllSales() {
        StatsService service = new StatsService();
        int[] amounts = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.allSales(amounts);
        int expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAverage() {
        StatsService service = new StatsService();
        int[] amounts = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.averageSales(amounts);
        int expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthMaxSale() {
        StatsService service = new StatsService();
        int[] amounts = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.calcMonthMaxSale(amounts);
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthMinSale() {
        StatsService service = new StatsService();
        int[] amounts = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.calcMonthMinSale(amounts);
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSalesBelowAverage() {
        StatsService service = new StatsService();
        int[] amounts = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.calcMonthsWithSalesBelowAverage(amounts);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSalesAboveAverage() {
        StatsService service = new StatsService();
        int[] amounts = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.calcMonthsWithSalesAboveAverage(amounts);
        int expected = 7;

        Assertions.assertEquals(expected, actual);
    }
}