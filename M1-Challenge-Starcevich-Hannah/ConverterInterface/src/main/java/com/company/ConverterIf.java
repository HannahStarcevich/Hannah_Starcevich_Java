package com.company;

import com.company.interfaces.Converter;

public class ConverterIf implements Converter {

    private String month1 = "January";
    private String month2 = "February";
    private String month3 = "March";
    private String month4 = "April";
    private String month5 = "May";
    private String month6 = "June";
    private String month7 = "July";
    private String month8 = "August";
    private String month9 = "September";
    private String month10 = "October";
    private String month11 = "November";
    private String month12 = "November";

    private String day1 = "Sunday";
    private String day2 = "Monday";
    private String day3 = "Tuesday";
    private String day4 = "Wednesday";
    private String day5 = "Thursday";
    private String day6 = "Friday";
    private String day7 = "Saturday";

    public String convertMonth(int monthNumber) {
        if (monthNumber == 1) {
            return month1;
        } else if (monthNumber == 2) {
            return month2;
        } else if (monthNumber == 3) {
            return month3;
        } else if (monthNumber == 4) {
            return month4;
        } else if (monthNumber == 5) {
            return month5;
        } else if (monthNumber == 6) {
            return month6;
        } else if (monthNumber == 7) {
            return month7;
        } else if (monthNumber == 8) {
            return month8;
        } else if (monthNumber == 9) {
            return month9;
        } else if (monthNumber == 10) {
            return month10;
        } else if (monthNumber == 11) {
            return month11;
        } else if (monthNumber == 12) {
            return month12;
        }
        return null;
    }

        public String convertDay(int dayNumber) {
            if (dayNumber == 1) {
                return day1;
            } else if (dayNumber == 2) {
                return day2;
            } else if (dayNumber == 3) {
                return day3;
            } else if (dayNumber == 4) {
                return day4;
            } else if (dayNumber == 5) {
                return day5;
            } else if (dayNumber == 6) {
                return day6;
            } else if (dayNumber == 7) {
                return day7;
            }
            return null;
        }

}
