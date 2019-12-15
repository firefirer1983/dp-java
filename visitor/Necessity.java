package visitor;


class Necessity implements Visitable {
    private String name;
    private double price;
    public Necessity(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public double accept(IVisitor v) {
        return v.visit(this);
    }
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}