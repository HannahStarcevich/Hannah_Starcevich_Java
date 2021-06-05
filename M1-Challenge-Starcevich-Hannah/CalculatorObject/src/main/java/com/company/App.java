package com.company;

public class App {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.add(1,2);
        calc.add(3.4,2.3);

        calc.subtract(23,52);
        calc.subtract(5.5,0.5);

        calc.multiply(34,2);
        calc.multiply(6.7,4.4);

        calc.divide(12,3);
        calc.divide(12,7);
        calc.divide(10.8,2.2);
    }
}
