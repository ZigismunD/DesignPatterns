package Adapter;

public class MovableAdapterImpl implements MovableAdapter {
    private Movable car;

    public MovableAdapterImpl(Movable car) {
        this.car = car;
    }

    @Override
    public double getSpeed() {
        return convertMPHtoKMH(this.car.getSpeed());
    }

    private double convertMPHtoKMH(double mph) {
        return mph * 1.60934;
    }
}
