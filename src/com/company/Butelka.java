package com.company;

import java.util.Random;

public class Butelka {
    private double ileLitrow;
    private double maxPojemnosc;

    Butelka(double ileLitrow) {
        this.ileLitrow = ileLitrow;
    }

    public double getIleLitrow() {
        return ileLitrow;
    }

    public double getMaxPojemnosc() {
        return maxPojemnosc;
    }

    public void setMaxPojemnosc(double maxPojemnosc) {
        this.maxPojemnosc = maxPojemnosc;
    }

    boolean wlej(double ileWlac) {
        if (ileWlac + ileLitrow > maxPojemnosc) {
            System.out.println("chcesz wlać wiecej niż wynosi pojemność tej butelki");
        }
        this.ileLitrow += ileWlac;

        return true;
    }

    void przelej(int ilePrzelac, Butelka gdziePrzelac) {
        if (wylej(ilePrzelac)) {
            if (gdziePrzelac.ileLitrow + ilePrzelac <= gdziePrzelac.maxPojemnosc) {
                gdziePrzelac.wlej(ilePrzelac);
            } else {
                double ileZostalo = (gdziePrzelac.ileLitrow + ilePrzelac) - gdziePrzelac.maxPojemnosc;
                gdziePrzelac.ileLitrow = gdziePrzelac.maxPojemnosc;
                wlej(ileZostalo);
                System.out.println("przelano do maks pojemnoscni butelki, reszta została w butelce z ktorej przelewałeś ");
            }
        }
    }

    boolean wylej(double ileWylac) {
        if (ileWylac > ileLitrow) {
            System.out.println(" nie ma tyle wody w tej butelce");
            return false;
        } else {
            this.ileLitrow -= ileWylac;
        }
        return true;
    }

    public static void main(String[] args) {
        Butelka[] butelka15L = new Butelka[10];
        uzupelnijbutelki(butelka15L);
        wyswietl(butelka15L);

//        butelka15L[3].wlej(20);
//        butelka15L[1].wylej(4);
//        butelka15L[6].wylej(5);
//        butelka15L[9].wylej(6);
        butelka15L[1].przelej(4, butelka15L[3]);
        butelka15L[2].przelej(6, butelka15L[4]);
        wyswietl(butelka15L);

    }

    private static void wyswietl(Butelka[] butelka) {
        for (Butelka butelka1 : butelka) {
            System.out.print(butelka1.getIleLitrow() + ", ");
        }
        System.out.println();
    }

    private static void uzupelnijbutelki(Butelka[] butelka) {
        Random random = new Random();
        for (int i = 0; i < butelka.length; i++) {
            butelka[i] = new Butelka(random.nextInt(15));
            butelka[i].maxPojemnosc = 15;
        }
    }
}
