package visitor;


class Visitor {

    public static void main(String[] args) {
        TaxVisitor tv = new TaxVisitor();

        Liqor xo = new Liqor("xo", 2000);
        Necessity milk = new Necessity("milk", 10);
        Tobacco zhonghua = new Tobacco("zhonghua", 20);

        System.out.println(xo.getName() + ":" + xo.accept(tv));
        System.out.println(milk.getName() + ":" + milk.accept(tv));
        System.out.println(zhonghua.getName() + ":" + zhonghua.accept(tv));
    }
}