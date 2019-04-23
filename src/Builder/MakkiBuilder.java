package Builder;

public class MakkiBuilder extends HamburgerBuilder {

    @Override
    public void buildSampyla() {
        hamburger.setSampyla("Vehnä");
    }

    @Override
    public void buildKastike() {
        hamburger.setKastike("Bernaisse");
    }

    @Override
    public void buildPihvi() {
        hamburger.setPihvi("Kana");
    }

    @Override
    public void setObject() {
        hamburger.setObject(true);
    }
}
