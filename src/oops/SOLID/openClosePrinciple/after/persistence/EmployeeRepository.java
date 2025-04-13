package oops.SOLID.openClosePrinciple.before.persistence;

import java.util.Arrays;
import java.util.List;

import oops.SOLID.openClosePrinciple.before.employees.Employee;
import oops.SOLID.openClosePrinciple.before.employees.FullTimeEmployee;
import oops.SOLID.openClosePrinciple.before.employees.PartTimeEmployee;

public class EmployeeRepository {

    public List<Employee> findAll(){

        ArrayList<Tax> FullTimeTaxes = new ArrayList<>();
        FullTimeTaxes.add(new IncomeTax(30));
        FullTimeTaxes.add(new ProfessionalTax(2));
        FullTimeTaxes.add(new EssTax(1));

        ArrayList<Tax> PartTimeTaxes = new ArrayList<>();
        PartTimeTaxes.add(new IncomeTax(20));
        PartTimeTaxes.add(new ProfessionalTax(3));
        PartTimeTaxes.add(new EssTax(1));

        ArrayList<Tax> InternTaxes = new ArrayList<>();
        InternTaxes.add(new IncomeTax(15));


        // Employees are kept in memory for simplicity
        Employee anna = new FullTimeEmployee("Anna Smith", 2000, FullTimeTaxes);
        Employee billy = new FullTimeEmployee("Billy Leech", 920, FullTimeTaxes);

        Employee steve = new PartTimeEmployee("Steve Jones", 800, PartTimeTaxes);
        Employee magda = new PartTimeEmployee("Magda Iovan", 920, PartTimeTaxes);

        return Arrays.asList(anna, billy, steve, magda);
    }
}