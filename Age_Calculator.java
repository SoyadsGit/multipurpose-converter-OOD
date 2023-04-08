package Converter;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Age_Calculator {

        void ageCal()
                {
                        System.out.print("Enter your date of birth in YYYY-MM-DD format: ");
                        Scanner scanner = new Scanner(System.in);
                        String input = scanner.nextLine();

                        LocalDate dob = LocalDate.parse(input);
                        LocalDate curDate = LocalDate.now();
                        Period period = Period.between(dob, curDate);
                        System.out.printf("Your age is %d years %d months and %d days.", period.getYears(), period.getMonths(), period.getDays());
                }
}
