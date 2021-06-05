package com.company;

import com.company.interfaces.Converter;

public class ConverterSwitch implements Converter {

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

    public String convertMonth(int monthNumber){
        switch(monthNumber){
            case 1:
                return month1;
            case 2:
                return month2;
            case 3:
                return month3;
            case 4:
                return month4;
            case 5:
                return month5;
            case 6:
                return month6;
            case 7:
                return month7;
            case 8:
                return month8;
            case 9:
                return month9;
            case 10:
                return month10;
            case 11:
                return month11;
            default:
                return month12;
        }
    }

    public String convertDay(int dayNumber){
        switch(dayNumber){
            case 1:
                return day1;
            case 2:
                return day2;
            case 3:
                return day3;
            case 4:
                return day4;
            case 5:
                return day5;
            case 6:
                return day6;
            default:
                return day7;
        }
    }
}
