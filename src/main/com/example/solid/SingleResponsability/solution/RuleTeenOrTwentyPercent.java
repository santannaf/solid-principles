package main.com.example.solid.SingleResponsability.solution;

import main.com.example.solid.SingleResponsability.utils.Employee;

@SuppressWarnings("unused")
public class RuleTeenOrTwentyPercent implements RuleCalculate {
    @Override
    public double calculate(Employee employee) {
        if(employee.getBaseSalary() > 3000.0) {
            return employee.getBaseSalary() * 0.8;
        }
        else {
            return employee.getBaseSalary() * 0.9;
        }
    }
}