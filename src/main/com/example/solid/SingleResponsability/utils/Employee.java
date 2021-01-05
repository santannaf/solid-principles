package main.com.example.solid.SingleResponsability.utils;

public class Employee {
    private String name;
    private OfficeOne officeOne;
    private OfficeTwo officeTwo;
    private double baseSalary;

    public Employee(String name, OfficeOne officeOne, double baseSalary) {
        this.name = name;
        this.officeOne = officeOne;
        this.baseSalary = baseSalary;
    }

    public Employee(String name, OfficeOne officeOne, OfficeTwo officeTwo, double baseSalary) {
        this.name = name;
        this.officeOne = officeOne;
        this.officeTwo = officeTwo;
        this.baseSalary = baseSalary;
    }

    public Employee() {
    }

    public OfficeOne getOfficeOne() {
        return officeOne;
    }

    public void setOfficeOne(OfficeOne officeOne) {
        this.officeOne = officeOne;
    }

    public OfficeTwo getOfficeTwo() {
        return officeTwo;
    }

    public void setOfficeTwo(OfficeTwo officeTwo) {
        this.officeTwo = officeTwo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OfficeOne getOffice() {
        return officeOne;
    }

    public void setOffice(OfficeOne officeOne) {
        this.officeOne = officeOne;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}