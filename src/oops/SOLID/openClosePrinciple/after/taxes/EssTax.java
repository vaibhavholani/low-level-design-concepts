// Concrete class for ESS tax calculated as a percentage.
public class EssTax extends PercentOfIncomeTax {

    public EssTax(double taxPercentage) {
        super(taxPercentage);
    }
    
    @Override
    public double calculate(double income) {
        return (income * getTaxPercentage()) / 100;
    }
}
