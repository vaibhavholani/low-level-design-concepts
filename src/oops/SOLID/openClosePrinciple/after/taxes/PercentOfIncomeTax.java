
public abstract class PercentOfIncomeTax implements Tax {
    protected double taxPercentage;
    
    public PercentOfIncomeTax(double taxPercentage) {
        this.taxPercentage = taxPercentage;
    }
    
    public double getTaxPercentage() {
        return taxPercentage;
    }
}
