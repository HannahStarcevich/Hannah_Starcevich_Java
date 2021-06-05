package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterIfTest {

    private ConverterIf converterIf;
    int dayOfWeek;
    int monthOfYear;

    @Before
    public void setUp(){
        converterIf = new ConverterIf();
        dayOfWeek = 3;
        monthOfYear = 11;
    }

    @Test
    public void shouldTakeIntegerBetween1And12AndReturnMonth(){
        //Arrange - what i expect
        String day3 = "Tuesday";
        String month11 = "November";

        //Act - what i got
        String dayOutput = converterIf.convertDay(dayOfWeek);
        String monthOutput = converterIf.convertMonth(monthOfYear);

        //Assert - compare what you expected to what you got
        assertEquals(day3, dayOutput);
        assertEquals(month11, monthOutput);
    }

    @Test
    public void shouldTakeIntegerBetween1And7AndReturnDayOfWeek(){
        //Arrange - what i expect
        String day3 = "Tuesday";
        String month11 = "November";

        //Act - what i got
        String dayOutput = converterIf.convertDay(dayOfWeek);
        String monthOutput = converterIf.convertMonth(monthOfYear);

        //Assert - compare what you expected to what you got
        assertEquals(day3, dayOutput);
        assertEquals(month11, monthOutput);
    }

}