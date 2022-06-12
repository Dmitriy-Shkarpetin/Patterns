package behavioral.visitor;

public class ConcreteElementB implements Element {
    public ConcreteElementB() {
    }

    public void Accept(BaseVisitor pVisitor) {
        pVisitor.VisitConcreteElementB(this);
    }
}
