package main.com.example.solid.SingleResponsability.solution;

import main.com.example.solid.SingleResponsability.utils.Employee;
import main.com.example.solid.SingleResponsability.utils.OfficeOne;

@SuppressWarnings("unused")
public class SalarySolutionOne {
    public double calculate(Employee employee) {
        if (OfficeOne.DEVELOPER.equals(employee.getOffice())) {
            return new RuleTeenOrTwentyPercent().calculate(employee);
        }

        if(OfficeOne.DBA.equals(employee.getOffice())) {
            return new RuleFifteenOrTwentyFivePercent().calculate(employee);
        }

        throw new RuntimeException("Invalid Employee !");
    }
}