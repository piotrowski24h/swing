package com.tutorial;

import java.time.LocalDate;

public class Booking {
    private String name;
    private String lastName;
    private LocalDate firstDay;
    private LocalDate lastDay;

    public Booking(String name, String lastName, LocalDate firstDay, LocalDate lastDay) {
        this.name = name;
        this.lastName = lastName;
        this.firstDay = firstDay;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getFirstDay() {
        return firstDay;
    }
    public LocalDate getLastDay() {
        return lastDay;
    }
    public void setFirstDay(LocalDate firstDay) {
        this.firstDay = firstDay;
    }
    public void setLastDay(LocalDate lastDay) {
        this.lastDay = lastDay;
    }
    public int age() {
        return 0;
    }

    /****/
    @Override
    public String toString() {
        return name + ' ' + lastName + ' '+ firstDay + ' ' + lastDay+ ' ';
    }
}
