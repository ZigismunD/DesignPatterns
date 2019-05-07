package Adapter;

public class Main {

    public static void main(String[] args) {

        Movable ferrari = new Ferrari(250);
        MovableAdapter ferrariAdapter = new MovableAdapterImpl(ferrari);

        System.out.println(ferrari.getSpeed() + " MPH");
        System.out.println(ferrariAdapter.getSpeed() + " KMH");
    }

}
