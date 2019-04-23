package Visitor;

public class StateVisitor implements Visitor {
    private int bonusPoints = 0;

    public StateVisitor() {

    }

    @Override
    public void visit(Charmander charmander) {
        bonusPoints += 5;
        System.out.println("Charmander gets 5 bonus points bringing the total to: " + this.bonusPoints + "!");
    }

    @Override
    public void visit(Charmeleon charmeleon) {
        bonusPoints += 10;
        System.out.println("Charmaleon gets 10 bonus points bringing the total to: " + this.bonusPoints + "!");
    }

    @Override
    public void visit(Charizard charizard) {
        bonusPoints += 15;
        System.out.println("Charizard gets 15 bonus points bringing the total to: " + this.bonusPoints + "!");
    }
}
