public class ShippingCostCalculator implements ShippingCostVisitor {
    private double distance; 

    public ShippingCostCalculator(double distance) {
        this.distance = distance;
    }
    
    @Override
    public double accept(Chair chair) {
        return 10.0;
    }
    
    @Override
    public double accept(Table table) {
        return 15.0 + 2.0 * table.getSize();
    }
    
    @Override
    public double accept(Sofa sofa) {
        return 20.0 + 0.5 * distance;
    }
}
