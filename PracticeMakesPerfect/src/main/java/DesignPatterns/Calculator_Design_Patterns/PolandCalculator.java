package DesignPatterns.Calculator_Design_Patterns;

public class PolandCalculator implements Calculator {

    private double zusAmount;
    private int taxPercentage;

    private CalculatorPolicy calculatorPolicy;

    public PolandCalculator(CalculatorPolicy calculatorPolicy) {
        this.calculatorPolicy = calculatorPolicy;
        zusAmount = 1000;
        taxPercentage = 20;
    }


    public double calculate(double amount) {
        double newAmount = (amount - zusAmount) - (amount - zusAmount) * (taxPercentage / 100);
        return 0;
    }

    public void setSalaryCalculator(CalculatorPolicy calculatorPolicy) {

        this.calculatorPolicy = calculatorPolicy;


    }

    public void setSalaryCalculator(ForPoliticiansCalculatorPolicy forPoliticiansCalculatorPolicy) {

    }

    public void setSalaryCalculator(StudentCalculatorPolicy studentCalculatorPolicy) {

    }
}
