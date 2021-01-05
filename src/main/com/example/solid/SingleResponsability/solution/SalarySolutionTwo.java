package main.com.example.solid.SingleResponsability.solution;

import main.com.example.solid.SingleResponsability.utils.Employee;
import main.com.example.solid.SingleResponsability.utils.OfficeTwo;

@SuppressWarnings("unused")
public class SalarySolutionTwo {
    public double calculate(Employee employee) {
        OfficeTwo officeOne = employee.getOfficeTwo();
        return officeOne.getRuleCalculate().calculate(employee);
    }
}