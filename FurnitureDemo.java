public class FurnitureDemo {
    public static void main(String[] args) {
    
        Furniture chair = new Chair(1.0);
        Furniture table = new Table(3.0);
        Furniture sofa = new Sofa(4.0);
        
        double shippingDistance = 100.0;
        FurnitureVisitor shippingCalculator = new ShippingCostCalculator(shippingDistance);
        
        System.out.println("Shipping cost for Chair: $" + chair.accept(shippingCalculator));
        System.out.println("Shipping cost for Table: $" + table.accept(shippingCalculator));
        System.out.println("Shipping cost for Sofa: $" + sofa.accept(shippingCalculator));
    }
}
