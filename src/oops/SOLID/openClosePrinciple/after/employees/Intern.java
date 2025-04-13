package oops.SOLID.openClosePrinciple.before.employees;

public class Intern extends Employee implements Taxable {
    private ArrayList<Tax> taxes;
    
    public Intern(String fullName, int monthlyIncome, int nbHours, ArrayList<Tax> taxes) {
        super(fullName, monthlyIncome);
        setNbHoursPerWeek(nbHours);
        this.setTaxes(taxes);
    }

    @Override
    public ArrayList<Tax> getTaxes() {
        if (this.monthlyIncome < 300000) {
            return new ArrayList<>();
        }
        return this.taxes;
    }
}
