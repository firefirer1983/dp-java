package visitor;


public interface IVisitor {

    double visit(Necessity item);
    double visit(Liqor item);
    double visit(Tobacco item);

}