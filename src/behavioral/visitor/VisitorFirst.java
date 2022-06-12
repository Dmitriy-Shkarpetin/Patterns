package behavioral.visitor;

public class VisitorFirst implements BaseVisitor {
    public void VisitConcreteElementA(ConcreteElementA pA) {
        System.out.print("\nVisitor First\t Element A\n");
    }

    public void VisitConcreteElementB(ConcreteElementB pB) {
        System.out.print("\nVisitor First\t Element B\n");
    }

}
