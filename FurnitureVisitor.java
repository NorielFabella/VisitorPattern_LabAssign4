public interface FurnitureVisitor {
    double accept(Chair chair);
    double accept(Table table);
    double accept(Sofa sofa);
}
