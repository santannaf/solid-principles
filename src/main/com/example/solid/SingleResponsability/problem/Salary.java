package main.com.example.solid.SingleResponsability.problem;

import main.com.example.solid.SingleResponsability.utils.Employee;
import main.com.example.solid.SingleResponsability.utils.OfficeOne;

@SuppressWarnings("unused")
public class Salary {
    public double calculate(Employee employee) {
        if (OfficeOne.DEVELOPER.equals(employee.getOffice())) {
            return teenOrTwentyPercent(employee);
        }
        if(OfficeOne.DBA.equals(employee.getOffice())) {
            return fifteenOrTwentyFivePercent(employee);

        }
        throw new RuntimeException("Invalid Employee !");
    }

    private double teenOrTwentyPercent(Employee employee) {
        if(employee.getBaseSalary() > 3000.0) {
            return employee.getBaseSalary() * 0.8;
        }
        else {
            return employee.getBaseSalary() * 0.9;
        }
    }

    private double fifteenOrTwentyFivePercent(Employee employee) {
        if(employee.getBaseSalary() > 3000.0) {
            return employee.getBaseSalary() * 0.75;
        }
        else {
            return employee.getBaseSalary() * 0.85;
        }
    }
}