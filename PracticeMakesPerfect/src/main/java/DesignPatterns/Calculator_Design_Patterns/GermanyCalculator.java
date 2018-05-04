package DesignPatterns.Calculator_Design_Patterns;

public class GermanyCalculator implements Calculator{

    private double zusAmount;

    private int taxPercentage;

    private CalculatorPolicy calculatorPolicy;

    public GermanyCalculator(CalculatorPolicy calculatorPolicy) {
        this.calculatorPolicy = calculatorPolicy;

        zusAmount = 1400;

        taxPercentage = 10;
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
