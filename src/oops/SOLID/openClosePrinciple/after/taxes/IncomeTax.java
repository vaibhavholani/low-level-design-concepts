// Concrete class that calculates income tax as a percentage of income.
public class IncomeTax extends PercentOfIncomeTax {

    public IncomeTax(double taxPercentage) {
        super(taxPercentage);
    }
    
    @Override
    public double calculate(double income) {
        // Calculate tax by multiplying income by tax percentage divided by 100.
        return (income * getTaxPercentage()) / 100;
    }
}
