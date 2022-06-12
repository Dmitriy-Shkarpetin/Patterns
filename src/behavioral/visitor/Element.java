package behavioral.visitor;

public interface Element {
    void Accept(BaseVisitor pVisitor);
}
