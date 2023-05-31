package Converter;

import java.util.Scanner;
public class BMI_Calculator {
    void bmiCal() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Write your weight in kilogram(KG): ");
            double weight = sc.nextDouble();
            System.out.print("Write your height in meters(M): ");
            double height = sc.nextDouble();
            double BMI = weight / (height * height);
            System.out.print("Your Body Mass Index (BMI) is = " + BMI + " kg/m2 \n");

            if(BMI < 18.5)       System.out.println("You are underweight");
            else if (BMI < 25)   System.out.println("You are normal");
            else if (BMI < 30)   System.out.println("You are overweight");
            else                 System.out.println("You are fatty");
        }
    }
