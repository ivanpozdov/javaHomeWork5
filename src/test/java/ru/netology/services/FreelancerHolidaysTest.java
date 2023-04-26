package ru.netology.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FreelancerHolidaysTest {
    @Test
    public void CountRestMonthsCase1() {
        FreelancerHolidays freelancerHolidays = new FreelancerHolidays();

        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expected = 3;
        int actual = freelancerHolidays.calculate(income, expenses, threshold);

        assertEquals(expected, actual);
    }

    @Test
    public void countRestMonthsCase2() {
        FreelancerHolidays freelancerHolidays = new FreelancerHolidays();

        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expected = 2;

        int actual = freelancerHolidays.calculate(income, expenses, threshold);

        assertEquals(expected, actual);

    }

}