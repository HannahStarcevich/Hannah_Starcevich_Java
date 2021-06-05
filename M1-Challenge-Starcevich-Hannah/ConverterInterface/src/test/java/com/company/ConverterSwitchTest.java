package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterSwitchTest {

    private ConverterSwitch converterSwitch;
    int dayOfWeek;
    int monthOfYear;

    @Before
    public void setUp(){
        converterSwitch= new ConverterSwitch();
        dayOfWeek = 7;
        monthOfYear = 3;
    }

    @Test
    public void shouldTakeIntegerBetween1And12AndReturnMonth(){
        //Arrange - what i expect
        String day7 = "Saturday";
        String month3 = "March";

        //Act - what i got
        String dayOutput = converterSwitch.convertDay(dayOfWeek);
        String monthOutput = converterSwitch.convertMonth(monthOfYear);

        //Assert - compare what you expected to what you got
        assertEquals(day7, dayOutput);
        assertEquals(month3, monthOutput);
    }

    @Test
    public void shouldTakeIntegerBetween1And7AndReturnDayOfWeek(){
        //Arrange - what i expect
        String day7 = "Saturday";
        String month3 = "March";

        //Act - what i got
        String dayOutput = converterSwitch.convertDay(dayOfWeek);
        String monthOutput = converterSwitch.convertMonth(monthOfYear);

        //Assert - compare what you expected to what you got
        assertEquals(day7, dayOutput);
        assertEquals(month3, monthOutput);
    }

}