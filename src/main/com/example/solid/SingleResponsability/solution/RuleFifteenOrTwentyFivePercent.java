package main.com.example.solid.SingleResponsability.solution;

import main.com.example.solid.SingleResponsability.utils.Employee;

@SuppressWarnings("unused")
public class RuleFifteenOrTwentyFivePercent implements RuleCalculate {
    @Override
    public double calculate(Employee employee) {
        if(employee.getBaseSalary() > 3000.0) {
            return employee.getBaseSalary() * 0.75;
        }
        else {
            return employee.getBaseSalary() * 0.85;
        }
    }
}