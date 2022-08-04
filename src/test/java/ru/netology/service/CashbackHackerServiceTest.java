package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class CashbackHackerServiceTest {

    @Test
    public void shouldAddIfSummLess1000() {

        CashbackHackerService hackerService = new CashbackHackerService();

        int amount = 450;
        int actual = hackerService.remain(amount);
        int expected = 550;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldAddiIfSumm0() {

        CashbackHackerService hackerService = new CashbackHackerService();

        int amount = 0;
        int actual = hackerService.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldAddiIfSumm1000() {

        CashbackHackerService hackerService = new CashbackHackerService();

        int amount = 1000;
        int actual = hackerService.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldAddIfSummOver1000() {

        CashbackHackerService hackerService = new CashbackHackerService();

        int amount = 1350;
        int actual = hackerService.remain(amount);
        int expected = 650;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldAddIfSummOver5000() {

        CashbackHackerService hackerService = new CashbackHackerService();

        int amount = 5720;
        int actual = hackerService.remain(amount);
        int expected = 280;

        assertEquals(actual, expected);
    }

}
