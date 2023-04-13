package Converter;

import java.util.Scanner;

public class Basic_Calculator {
    void calculator() {
        Scanner input = new Scanner(System.in);

            System.out.println("\nEnter operation: ");
            System.out.println("1.Addition \n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulus");
            int choice = input.nextInt();
            System.out.printf("Enter first number: ");
            double num1 = input.nextDouble();
            System.out.printf("Enter second number: ");
            double num2 = input.nextDouble();

            switch (choice) {
                case 1 -> System.out.println("Addition of two numbers = " + (num1 + num2));
                case 2 -> System.out.println("Subtraction of two numbers = " + (num1 - num2));
                case 3 -> System.out.println("Multiplication of two numbers = " + (num1 * num2));
                case 4 -> System.out.println("Division of two numbers = " + (num1 / num2));
                case 5 -> System.out.println("Modulus of two numbers = " + (num1 % num2));
                default -> System.out.println("Invalid choice");
            }
        }
    }
