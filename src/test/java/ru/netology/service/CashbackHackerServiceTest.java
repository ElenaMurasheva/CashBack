package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackerServiceTest {

    @Test
    public void shouldAddIfSummLess1000() {

        CashbackHackerService hackerService = new CashbackHackerService();

        int amount = 250;
        int actual = hackerService.remain(amount);
        int expected = 750;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldAddiIfSumm0() {

        CashbackHackerService hackerService = new CashbackHackerService();

        int amount = 0;
        int actual = hackerService.remain(amount);
        int expected = 1000;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldAddiIfSumm1000() {

        CashbackHackerService hackerService = new CashbackHackerService();

        int amount = 1000;
        int actual = hackerService.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldAddIfSummOver1000() {

        CashbackHackerService hackerService = new CashbackHackerService();

        int amount = 1740;
        int actual = hackerService.remain(amount);
        int expected = 260;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldAddIfSummOver5000() {

        CashbackHackerService hackerService = new CashbackHackerService();

        int amount = 5110;
        int actual = hackerService.remain(amount);
        int expected = 890;

        assertEquals(expected, actual);
    }

}
