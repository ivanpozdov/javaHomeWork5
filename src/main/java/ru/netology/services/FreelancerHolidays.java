package ru.netology.services;

public class FreelancerHolidays {
    public int calculate(int income, int expenses, int threshold) {
        int counter = 0;
        int money = 0;
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                counter++;
                money = money - expenses;
                money = money / 3;
            } else {
                money = money + income - expenses;
            }
        }
        return counter;
    }
}

