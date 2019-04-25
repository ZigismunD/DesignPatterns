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
                klooniKello.setAika(5, 20, 55);
            }
            loops++;

        }
    }
}
