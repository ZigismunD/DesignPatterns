package Builder;

abstract class HamburgerBuilder {
    protected Hamburger hamburger;

    public Object getHamburger() {
        return this.hamburger.getObject();
    }

    public void createNewHamburger() {
        hamburger = new Hamburger();
    }

    public abstract  void buildSampyla();
    public abstract void buildKastike();
    public abstract void buildPihvi();
    public abstract void setObject();
}
