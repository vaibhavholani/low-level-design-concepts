package oops.SOLID.openClosePrinciple.before.employees;

public class PartTimeEmployee extends Employee implements Taxable {
    private ArrayList<Tax> taxes;
    
    public PartTimeEmployee(String fullName, int monthlyIncome, ArrayList<Tax> taxes) {
        super(fullName, monthlyIncome);
        this.setNbHoursPerWeek(20);
        this.setTaxes(taxes);
    }

    @Override
    public ArrayList<Tax> getTaxes() {
        return this.taxes;
    }
}