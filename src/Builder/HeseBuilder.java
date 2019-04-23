package Builder;

public class HeseBuilder extends HamburgerBuilder {


    @Override
    public void buildSampyla() {
        hamburger.setSampyla("Ruis");
    }

    @Override
    public void buildKastike() {
        hamburger.setKastike("Majoneesi");
    }

    @Override
    public void buildPihvi() {
        hamburger.setPihvi("Nauta");
    }

    @Override
    public void setObject() {
        hamburger.setObject(false);
    }

}
