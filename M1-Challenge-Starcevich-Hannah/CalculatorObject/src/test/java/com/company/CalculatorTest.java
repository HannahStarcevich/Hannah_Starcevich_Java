package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calc;
    int intA;
    int intB;
    int intExpected;
    int intOutput;
    double doubleA;
    double doubleB;
    double doubleExpected;
    double doubleOutput;

    @Before
    public void setUp(){
        calc = new Calculator();
    }

    @Test
    public void shouldReturnSumOfTwoInts(){
        //Arrange - what i expect
        intA = 1;
        intB = 1;
        intExpected = intA + intB;
        //Act - what i got
        intOutput = calc.add(intA, intB);
        //Assert - compare what you expected to what you got
        assertEquals(intExpected, intOutput);
    }

    @Test
    public void shouldReturnSumOfTwoDoubles(){
        //Arrange - what i expect
        doubleA = 3.4;
        doubleB = 2.3;
        doubleExpected = doubleA + doubleB;
        //Act - what i got
        doubleOutput = calc.add(doubleA, doubleB);
        //Assert - compare what you expected to what you got
        assertEquals(doubleExpected, doubleOutput, 0);
    }

    @Test
    public void shouldReturnDifferenceOfTwoInts(){
        //Arrange - what i expect
        intA = 23;
        intB = 52;
        intExpected = intA - intB;
        //Act - what i got
        intOutput = calc.subtract(intA, intB);
        //Assert - compare what you expected to what you got
        assertEquals(intExpected, intOutput);
    }

    @Test
    public void shouldReturnDifferenceOfTwoDoubles(){
        //Arrange - what i expect
        doubleA = 5.5;
        doubleB = 0.5;
        doubleExpected = doubleA - doubleB;
        //Act - what i got
        doubleOutput = calc.subtract(doubleA, doubleB);
        //Assert - compare what you expected to what you got
        assertEquals(doubleExpected, doubleOutput, 0);
    }

    @Test
    public void shouldReturnProductOfTwoInts(){
        //Arrange - what i expect
        intA = 34;
        intB = 2;
        intExpected = intA * intB;
        //Act - what i got
        intOutput = calc.multiply(intA, intB);
        //Assert - compare what you expected to what you got
        assertEquals(intExpected, intOutput);
    }

    @Test
    public void shouldReturnProductOfTwoDoubles(){
        //Arrange - what i expect
        doubleA = 6.7;
        doubleB = 4.4;
        doubleExpected = doubleA * doubleB;
        //Act - what i got
        doubleOutput = calc.multiply(doubleA, doubleB);
        //Assert - compare what you expected to what you got
        assertEquals(doubleExpected, doubleOutput, 0);
    }

    @Test
    public void shouldReturnQuotientOfTwoInts(){
        //Arrange - what i expect
        intA = 12;
        intB = 3;
        intExpected = intA / intB;
        //Act - what i got
        intOutput = calc.divide(intA, intB);
        //Assert - compare what you expected to what you got
        assertEquals(intExpected, intOutput);
    }

    @Test
    public void shouldReturnQuotientOfTwoDoubles(){
        //Arrange - what i expect
        doubleA = 12;
        doubleB = 7;
        doubleExpected = doubleA / doubleB;
        //Act - what i got
        doubleOutput = calc.divide(doubleA, doubleB);
        //Assert - compare what you expected to what you got
        assertEquals(doubleExpected, doubleOutput, 0);
    }
}