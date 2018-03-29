package com.company;
/*
Utwórz metodę, która przyjmuje dwuwymiarową tablicę oraz parametr (wartość logiczną). Metoda ma zwrócić nową
tablicę która będzie odwrócona o 90 stopni w stosunku do wejściowej. W przypadku gdy drugi parametr ma wartość
true obracamy zgodnie z rucham wskazówek zegara. W przypadki wartości false obracamy przeciwnie do

dla parametru true oraz tablicy:

1 1 1
2 2 2
3 3 3
ma zwrócić

3 2 1
3 2 1
3 2 1
 */

public class Tablice3ObrotLewoPrawo {
    private static int[][] tablica;

    public static void main(String[] args) {
        uzupelnijtablice(4);
        wyswietlTablice();
        obrocTablice(false);
        System.out.println();
        wyswietlTablice();
    }

    private static int[][] obrocTablice(boolean wKtoraStrone) {
        int nowatablica[][] = new int[tablica.length][tablica.length];
        if (wKtoraStrone) {
            int a=tablica.length-1;
            for (int i = 0; i < nowatablica.length; i++,a--) {
                int b=tablica.length-1;
                for (int j = 0; j < nowatablica.length; j++,b--) {
                    nowatablica[i][j] = tablica[b][a];
                }
            }
        } else {
            for (int i = 0; i < nowatablica.length; i++) {
                for (int j = 0; j < nowatablica.length; j++) {
                    nowatablica[i][j] = tablica[j][i];
                }
            }
        }
        return tablica = nowatablica;
    }

    private static void wyswietlTablice() {
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica.length; j++) {
                System.out.print(tablica[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static int[][] uzupelnijtablice(int rozmiar) {
        tablica = new int[rozmiar][rozmiar];
        int wypelniacz = 1;
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica.length; j++) {
                tablica[i][j] = wypelniacz;
            }
            wypelniacz++;
        }
        return tablica;
    }
}
