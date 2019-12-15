package visitor;


public interface Visitable {

    double accept(IVisitor v);

}