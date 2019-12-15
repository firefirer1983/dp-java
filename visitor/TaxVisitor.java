package visitor;


class TaxVisitor implements IVisitor {

    public double visit(Necessity item) {
        return item.getPrice() + item.getPrice()*(0);
    }

    public double visit(Liqor item) {
        return item.getPrice() + item.getPrice()*(0.18);
    }

    public double visit(Tobacco item) {
        return item.getPrice() + item.getPrice()*(0.33);
    }
}