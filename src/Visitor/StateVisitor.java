package Visitor;

public class StateVisitor implements Visitor {

    public StateVisitor() {

    }

    @Override
    public void visit(Charmander charmander) {
        System.out.println("I am a charmander!");
    }

    @Override
    public void visit(Charmeleon charmeleon) {
        System.out.println("I am Charmeleon!");
    }

    @Override
    public void visit(Charizard charizard) {
        System.out.println("I am Charizard");
    }
}
