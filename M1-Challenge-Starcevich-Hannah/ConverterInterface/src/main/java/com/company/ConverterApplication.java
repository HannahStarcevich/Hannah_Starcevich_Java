package com.company;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ConverterApplication {
    public static void main(String[] args) {

        int dayOfWeek = userInput(7);
        int monthOfYear = userInput(12);

        // instantiating both converter classes
        ConverterIf converterIf = new ConverterIf();
        ConverterSwitch converterSwitch = new ConverterSwitch();

        System.out.println("=====Using the ConverterIf Implementation=====");
        System.out.println("The day you have selected is " + converterIf.convertDay(dayOfWeek));
        System.out.println("The month you have selected is " + converterIf.convertMonth(monthOfYear));

        System.out.println("=====Using the ConverterSwitch Implementation=====");
        System.out.println("The day you have selected is " + converterSwitch.convertDay(dayOfWeek));
        System.out.println("The month you have selected is " + converterSwitch.convertMonth(monthOfYear));

    }

    public static int userInput(int maxNum) {
        // create the scanner for user input
        Scanner scan = new Scanner(System.in);
        int userInput = 0;

        // unchecked exception for user input
        do {
            try {
                System.out.println("Please input a number between 1 and " + maxNum);
                userInput = Integer.parseInt(scan.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Not a number. Please try again.");
            }
        } while (userInput < 1 || userInput > maxNum);

        System.out.println("You entered " + userInput + "");

        return userInput;
    }

}
