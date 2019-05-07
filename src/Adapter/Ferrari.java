package Adapter;

public class Ferrari implements Movable {
    private double speed;

    public Ferrari(double speed) {
        this.speed = speed;
    }

    @Override
    public double getSpeed() {
        return this.speed;
    }
}
