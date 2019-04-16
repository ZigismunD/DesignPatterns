package Visitor;

public class StateContext {
    private State state;

    public StateContext() {
        state = new Charmander(this);
    }

    public void setState(State newState) {
        this.state = newState;
    }

    public void makeSound() {
        state.makeSound();
        state.nextState();
    }

    public void accept(Visitor visitor) {
        state.accept(visitor);
    }
}
