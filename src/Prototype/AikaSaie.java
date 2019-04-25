package Prototype;

public class AikaSaie implements Runnable {
    private int loops = 0;

    @Override
    public void run() {
        Kello kello = new Kello("Kello");
        Kello klooniKello = (Kello) kello.clone();
        klooniKello.setKello("Klooni");
        while (true) {
            System.out.println(kello);
            System.out.println(klooniKello);

            kello.addTime();
            klooniKello.addTime();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (loops == 10) {
                klooniKello.setTuntiviisari(new Viisari(5));
                klooniKello.setMinuuttiviisari(new Viisari(20));
                klooniKello.setSekuntiviisari(new Viisari(55));
            }
            loops++;

        }
    }
}
