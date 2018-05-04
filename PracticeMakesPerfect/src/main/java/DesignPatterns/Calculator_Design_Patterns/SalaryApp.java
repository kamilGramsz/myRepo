package DesignPatterns.Calculator_Design_Patterns;

import java.util.Scanner;

public class SalaryApp {

    public static void main(String[] args) {

        System.out.println("Hello! Please choose a country: ");
        System.out.println("1. Poland");
        System.out.println("2. Germany");

        Scanner scanner = new Scanner(System.in);
        int country = scanner.nextInt();

        CalculatorFactory factory = new CalculatorFactory();
        Calculator calculator = factory.getCalculator(country);

        System.out.println("If you are a student please press 1, " + "If you are a politician, please press 2, "+" otherwise press other number");
        int policy = scanner.nextInt();

        if (policy == 1) {
            calculator.setSalaryCalculator(new StudentCalculatorPolicy());
        } else if (policy == 2) {
            calculator.setSalaryCalculator(new ForPoliticiansCalculatorPolicy());
        }
        double salary = 10000;
        double salaryAfterTaxes = calculator.calculate(salary);
        System.out.println("Calculated salary after taxes: " + salaryAfterTaxes);

    }


}
