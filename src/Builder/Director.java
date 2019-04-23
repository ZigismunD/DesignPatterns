package Builder;

public class Director {
    private HamburgerBuilder hampBuilder;

    public void setHampBuilder(HamburgerBuilder hb) {
        hampBuilder = hb;
    }

    public Object getHamburger() {
        return hampBuilder.getHamburger();
    }

    public void constructHamburger() {
        hampBuilder.createNewHamburger();
        hampBuilder.setObject();
        hampBuilder.buildSampyla();
        hampBuilder.buildKastike();
        hampBuilder.buildPihvi();
    }
}
