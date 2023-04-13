package Converter;
import java.util.Scanner;

public class Distance_Calculator {
    static double convertIntoKms(double miles){
        return 1.609*miles;
    }
    static double convertIntoMiles(double km){
        return km/1.609;
    }
     void disCal()
     {
         Scanner sc  =   new Scanner(System.in);
         System.out.print("Enter Distance in Miles  : ");
         double miles   =   sc.nextDouble();
         System.out.println(miles+" Miles equal to : "+convertIntoKms(miles)+" KMs");

         System.out.print("Enter Distance in Km  : ");
         double kms   =   sc.nextDouble();
         System.out.println(kms+" KMs equal to : "+convertIntoMiles(kms)+" Miles");
     }
}
