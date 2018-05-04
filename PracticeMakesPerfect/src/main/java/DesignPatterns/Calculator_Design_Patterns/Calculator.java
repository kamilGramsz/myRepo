package DesignPatterns.Calculator_Design_Patterns;

public interface Calculator {

    double calculate(double amount);
    void setSalaryCalculator(CalculatorPolicy calculatorPolicy);

    void setSalaryCalculator(ForPoliticiansCalculatorPolicy forPoliticiansCalculatorPolicy);

    void setSalaryCalculator(StudentCalculatorPolicy studentCalculatorPolicy);
}
