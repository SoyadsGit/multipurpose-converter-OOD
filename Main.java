package Converter;

import java.util.Scanner;
public class Main extends Polymorphism {
    public static void main(String[] args) {
        System.out.println(".....................................Menu...................................");
        Polymorphism pm = new Polymorphism();
        pm.funCal();
        rec();
    }
    static void rec()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("\nDo you wants to go Menu again? \n If yes enter 1 else 0");
        int choice = input.nextInt();

        Polymorphism pm = new Polymorphism();
        if(choice==1)   { pm.funCal(); rec(); }
        else             System.out.println("Thank You! Have a good day :)");
    }
}
