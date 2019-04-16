package Visitor;

public class Main {

    public static void main(String[] args) {
        StateContext sc = new StateContext();
        Visitor visitor = new StateVisitor();

        sc.accept(visitor);
        sc.makeSound();
        sc.accept(visitor);
        sc.makeSound();
        sc.accept(visitor);
        sc.makeSound();

    }
}
