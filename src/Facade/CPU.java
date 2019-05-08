package Facade;

public class CPU {
    public void freeze() {
        System.out.println("Freeze");
    }
    public void jump(long position) {
        System.out.println("Siirtyy positioon: " + position);
    }
    public void execute() {
        System.out.println("Suorittaa!");
    }
}
