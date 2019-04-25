package Prototype;

public class Viisari implements Prototype {

    private int aika;

    public Viisari(int aika) {
        this.aika = aika;
    }

    @Override
    public Object clone() {
        Viisari viisari = null;
        try {
            viisari = (Viisari) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return viisari;
    }


    public int getAika() {
        return this.aika;
    }

    public void setAika(int aika){
        this.aika = aika;
    }

    public void addTime() {
        aika += 1;
    }
}
