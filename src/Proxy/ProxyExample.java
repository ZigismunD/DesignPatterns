package Proxy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ProxyExample {
    static Integer pictureShowing = null;
    static List<Image> lista = new ArrayList();

    /**
     * Test method
     */
    public static void main(final String[] arguments) {
        int valinta;

        Scanner lukija = new Scanner(System.in);
        Image image1 = new ProxyImage("HiRes_10MB_Photo1");
        Image image2 = new ProxyImage("HiRes_10MB_Photo2");
        Image image3 = new ProxyImage("HiRes_10MB_Photo3");
        Image image4 = new ProxyImage("HiRes_10MB_Photo4");
        Image image5 = new ProxyImage("Hires_10Mb_Photo5");


        lista.add(image1);
        lista.add(image2);
        lista.add(image3);
        lista.add(image4);
        lista.add(image5);

        do {
            System.out.println("Valitse:");
            System.out.println("1. Edellinen kuva");
            System.out.println("2. Seuraava kuva");
            System.out.println("3. Tulosta kuvien nimet");
            System.out.println("0. Lopeta");
            System.out.println();
            valinta = Integer.parseInt(lukija.nextLine());
            System.out.println();

            switch (valinta) {
                case 1:
                    edellinenKuva();
                    break;
                case 2:
                    seuraavaKuva();
                    break;
                case 3:
                    tulostaKuvienNimet();
            }
            System.out.println();
        } while (valinta != 0);
    }

    static public void tulostaKuvienNimet() {
        for (Image image : lista) {
            image.showData();
        }
    }

    static public void seuraavaKuva() {
        if (pictureShowing == null || pictureShowing == lista.size() - 1) {
            lista.get(0).displayImage();
            pictureShowing = 0;
        } else {
            lista.get(++pictureShowing).displayImage();
        }
    }

   static public void edellinenKuva() {
        if (pictureShowing == null || pictureShowing == 0) {
            lista.get(lista.size() - 1).displayImage();
            pictureShowing = lista.size() - 1;
        } else {
            lista.get(--pictureShowing).displayImage();
        }
    }
}