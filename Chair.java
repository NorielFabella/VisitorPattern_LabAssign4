public class Chair implements Furniture {
    private double size; 

    public Chair(double size) {
        this.size = size;
    }
    
    public double getSize() {
        return size;
    }
    
    @Override
    public double accept(FurnitureVisitor visitor) {
        return visitor.accept(this);
    }
}
