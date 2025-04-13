package oops.SOLID.openClosePrinciple.before.employees;

public class FullTimeEmployee extends Employee implements Taxable {

    private ArrayList<Tax> taxes;

    public FullTimeEmployee(String fullName, int monthlyIncome, ArrayList<Tax> taxes) {
        super(fullName, monthlyIncome);
        this.setNbHoursPerWeek(40);
        this.setTaxes(taxes);
    }

    @Override
    public ArrayList<Tax> getTaxes() {
        return this.taxes;
    }
    
}
