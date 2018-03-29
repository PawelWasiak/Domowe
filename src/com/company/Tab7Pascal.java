package com.company;
/*
Utwórz metodę, która przyjmuje wysokość trójkąta Pascala a następnie tworzy odpowiednią strukturę danych i ją wypełnia

dla 6 zwróci
[1]
[1, 1]
[1, 2, 1]
[1, 3, 3, 1]
[1, 4, 6, 4, 1]
[1, 5, 10, 10, 5, 1]
 */

public class Tab7Pascal {
    private static int[][] tablica;

    public static void main(String[] args) {
        int wysokosc = 13;
        stworzTablice(wysokosc);
        wypelnijTablice();
        narysujTablice();

    }

    private static void wypelnijTablice() {
        tablica[0][0] = 1;
        for (int i = 1; i < tablica.length; i++) {
            tablica[i][0] = 1;
            tablica[i][i] = 1;
            for (int j = 1; j < tablica[i].length - 1; j++) {
                tablica[i][j] = tablica[i - 1][j - 1] + tablica[i - 1][j];
            }
        }
    }

    private static void narysujTablice() {
        int a = tablica.length;
        for (int i = 0; i < tablica.length; i++) {
            System.out.print(i + ":");
            for (int j = a; j > 0; j--) {
                System.out.print("   ");
            }
            for (int j = 0; j < tablica[i].length; j++) {
                if (tablica[i][j] < 10) {
                    System.out.print(tablica[i][j] + "    ");
                } else if (tablica[i][j] < 100) {
                    System.out.print(tablica[i][j] + "   ");
                } else if (tablica[i][j] < 1000) {
                    System.out.print(tablica[i][j] + "  ");
                } else {
                    System.out.print(tablica[i][j] + " ");

                }
            }
            System.out.println();
            a--;
        }
    }

    private static void stworzTablice(int wysokosc) {
        tablica = new int[wysokosc][];
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = new int[i + 1];
        }
    }

}

