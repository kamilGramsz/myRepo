package DesignPatterns.Calculator_Design_Patterns;

public class BasicCalculatorPolicy implements CalculatorPolicy {

    public double calculate(double basicSalary) {
        return basicSalary;
    }
}
