package ru.netology.service;
import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    @org.tetsng.annotations.Test
    public void testRemainWithBoundaryValue() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 1000;
        int expected = 0;

        int actual = cashbackHackService.remain(amount);

        assertEquals(expected, actual);
    }
}
