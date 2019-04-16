package Visitor;

public interface State {
    void nextState();
    void makeSound();
    void accept(Visitor visitor);
}
