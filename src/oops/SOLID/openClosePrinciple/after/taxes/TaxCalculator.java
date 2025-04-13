package oops.SOLID.openClosePrinciple.before.taxes;


import oops.SOLID.openClosePrinciple.before.employees.Employee;
import oops.SOLID.openClosePrinciple.before.employees.Taxable;

public class TaxCalculator {
    

    public static double calculate(Employee employee) {
        if (employee instanceof Taxable) {
            return ((Taxable) employee).calculateTax();
        }
        return 0;
    }
}