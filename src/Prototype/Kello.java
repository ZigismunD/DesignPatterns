package Prototype;

public class Kello implements Prototype {
    private Viisari tuntiviisari, minuuttiviisari, sekuntiviisari;
    private String kello;

    public Kello(String kello) {
        this.tuntiviisari = new Viisari(1);
        this.minuuttiviisari = new Viisari(1);
        this.sekuntiviisari = new Viisari(1);
        this.kello = kello;
    }

    public void setTuntiviisari(Viisari tuntiviisari) {
        this.tuntiviisari = tuntiviisari;
    }

    public void setMinuuttiviisari(Viisari minuuttiviisari) {
        this.minuuttiviisari = minuuttiviisari;
    }

    public void setSekuntiviisari(Viisari sekuntiviisari) {
        this.sekuntiviisari = sekuntiviisari;
    }

    @Override
    public Object clone() {
        Kello kello = null;
        try {
            kello = (Kello) super.clone();
            kello.setTuntiviisari((Viisari) tuntiviisari.clone());
            kello.setMinuuttiviisari((Viisari) minuuttiviisari.clone());
            kello.setSekuntiviisari((Viisari) sekuntiviisari.clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return kello;
    }

    public String toString() {
        return this.kello + ": " + tuntiviisari.getAika() + ":" + minuuttiviisari.getAika() + ":" + sekuntiviisari.getAika();
    }

    public void addTime() {
        if (this.sekuntiviisari.getAika() == 59 && this.minuuttiviisari.getAika() == 59 && this.tuntiviisari.getAika() == 23) {
            this.sekuntiviisari.setAika(0);
            this.minuuttiviisari.setAika(0);
            this.tuntiviisari.setAika(0);
        } else if (this.sekuntiviisari.getAika() == 59 && this.minuuttiviisari.getAika() == 59) {
            this.tuntiviisari.addTime();
            this.sekuntiviisari.setAika(0);
            this.minuuttiviisari.setAika(0);
        } else if (this.sekuntiviisari.getAika() == 59) {
            this.minuuttiviisari.addTime();
            this.sekuntiviisari.setAika(0);
        } else {
            this.sekuntiviisari.addTime();
        }
    }

    public void setKello(String kello) {
        this.kello = kello;
    }
}
