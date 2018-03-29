package com.company;
/*
Utwórz metodę, która przyjmuje dwa parametry będące szerokością (pierwszy paramet) i wysokością
(drugi parametr) planszy. Metoda ma wypełnić i zwrócić tablicę wypełnioną spiralnie:

dla parametrów (4, 3)

1  2  3  4
10 11 12 5
9  8  7  6
 */

public class TabSpirala {
    private static int[][] tablica;

    public static void main(String[] args) {
        int wysokosc = 10;
        int szerokosc = 10;
        stworzTablice(wysokosc, szerokosc);
        wyswietlTablice();
    }

    private static void wyswietlTablice() {
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
                System.out.print(tablica[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static void stworzTablice(int wysokosc, int szerokosc) {
        tablica = new int[wysokosc][szerokosc];
        int licznik = 1;
        for (int i = 0; licznik <wysokosc*szerokosc; i++) {
            for (int j = i; j < tablica[i].length - 1 - i; j++) {             //gora
                tablica[i][j] = licznik;
                licznik++;
            }
            for (int j = i; j < tablica.length - 1 - i; j++) {              //prawo
                tablica[j][tablica[i].length - 1 - i] = licznik;
                licznik++;
            }
            for (int j = tablica[i].length - 1 - i; j > i; j--) {                  //dol
                tablica[tablica.length - 1 - i][j] = licznik;
                licznik++;
            }
            for (int j = tablica.length - 1 - i; j > i; j--) {                  //lewo
                tablica[j][i] = licznik;
                licznik++;
            }
        }
    }
}
