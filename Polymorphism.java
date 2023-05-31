package Converter;

import java.util.Scanner;
public class Polymorphism extends Abstraction{
    @Override
    void funCal() {
        System.out.println("1.Basic Calculator \n2.Age Calculator \n3.Distance Calculator \n4.BMI Calculator");
        System.out.printf("\nEnter operation: ");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        switch (choice) {
            case 1 -> {
                Basic_Calculator bc = new Basic_Calculator();
                bc.calculator();
            }
            case 2 -> {
                Age_Calculator ac = new Age_Calculator();
                ac.ageCal();
            }
            case 3 -> {
                Distance_Calculator dc = new Distance_Calculator();
                dc.disCal();
            }
            case 4 -> {
                BMI_Calculator bmi = new BMI_Calculator();
                bmi.bmiCal();
            }
        }
    }
}
