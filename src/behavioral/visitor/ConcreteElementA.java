package behavioral.visitor;

public class ConcreteElementA implements Element {
    public ConcreteElementA() {
    }

    public void Accept(BaseVisitor pVisitor) {
        pVisitor.VisitConcreteElementA(this);
    }

}
