package Visitor;

public class Charmeleon implements State {
    StateContext sc;

    public Charmeleon(StateContext sc) {
        this.sc = sc;
    }

    @Override
    public void nextState() {
        sc.setState(new Charizard());
    }

    @Override
    public void makeSound() {
        System.out.println("Charmaleon!");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
