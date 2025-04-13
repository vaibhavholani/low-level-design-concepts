package oops.SOLID.DependencyInversionPrinciple.after.main;

import java.util.Arrays;
import java.util.List;

import oops.SOLID.DependencyInversionPrinciple.after.employees.Employee;
import oops.SOLID.DependencyInversionPrinciple.after.employees.FullTimeEmployee;
import oops.SOLID.DependencyInversionPrinciple.after.employees.PartTimeEmployee;
import oops.SOLID.DependencyInversionPrinciple.after.payments.PaymentProcessor;
import oops.SOLID.DependencyInversionPrinciple.after.repositories.EmployeeFileRepository;
import oops.SOLID.DependencyInversionPrinciple.after.serielizer.EmployeeFileSerializer;

public class PayEmployeesMain {

    public static void main(String[] args) {

        // Create employees
        Employee anna = new FullTimeEmployee("Anna Smith", 2000);
        Employee billy = new FullTimeEmployee("Billy Leech", 920);

        Employee steve = new PartTimeEmployee("Steve Jones", 800);
        Employee magda = new PartTimeEmployee("Magda Iovan", 920);
        
        List<Employee> employees = Arrays.asList(anna, billy, steve, magda);

        EmployeeFileSerializer serializer = new EmployeeFileSerializer();
        EmployeeFileRepository employeeRepository = new EmployeeFileRepository(serializer, employees);

        PaymentProcessor paymentProcessor = new PaymentProcessor(employeeRepository);

        int totalPayments = paymentProcessor.sendPayments();
        
        System.out.println("Total payments " + totalPayments);
    }
}
