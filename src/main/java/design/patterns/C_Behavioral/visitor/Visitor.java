package design.patterns.C_Behavioral.visitor;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);
}
