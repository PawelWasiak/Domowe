package com.company;

public class TabSudoku {
    private static int[][] tablica = new int[9][];

    public static void main(String[] args) {
        przykladowaTablica();                 // zwraca wynik false
        System.out.println(sprawdzCzyPoprawcna());

    }

    private static boolean sprawdzCzyPoprawcna() {
//        poprawnaTablica();                   // zwraca true
//        sprawdzMaleKwadraty();
        if (sprawdzPionPoz()) return false;
        return true;
    }
//                do zrobienia na pozniej
//    private static boolean sprawdzMaleKwadraty() {
//        for (int i = 0; i < tablica.length; i++) {
//            for (int j = 0; j < tablica.length; j++) {
//                for (int k = 1 + j; k < tablica.length; k++) {
//                    if (    tablica[i][j] == tablica[i][k] ||
//                            tablica[j][i] == tablica[k][i] ||
//                            tablica[i][j]== tablica[i+1][k+1]) {
//                        return true;
//                    }
//                }
//            }
//        }
//        return false;
//    }

    private static boolean sprawdzPionPoz() {
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica.length; j++) {
                for (int k = 1 + j; k < tablica.length; k++) {
                    //sprawdza w pionie i poziomie czy ktoraś się powtarza
                    if (tablica[i][j] == tablica[i][k] || tablica[j][i] == tablica[k][i]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static void przykladowaTablica() {
        tablica[0] = new int[]{2, 4, 5, 7, 1, 6, 8, 3, 9};
        tablica[1] = new int[]{1, 3, 6, 3, 7, 8, 1, 5, 9};
        tablica[2] = new int[]{2, 3, 5, 4, 7, 1, 8, 4, 6};
        tablica[3] = new int[]{2, 3, 5, 3, 1, 4, 8, 6, 9};
        tablica[4] = new int[]{1, 3, 2, 3, 2, 6, 8, 7, 5};
        tablica[5] = new int[]{3, 4, 5, 2, 2, 6, 8, 1, 9};
        tablica[6] = new int[]{4, 9, 5, 3, 2, 7, 1, 5, 8};
        tablica[7] = new int[]{5, 3, 3, 1, 2, 8, 4, 2, 9};
        tablica[8] = new int[]{7, 3, 1, 5, 2, 6, 8, 5, 6};
    }

    private static void poprawnaTablica() {
        tablica[0] = new int[]{5, 3, 4, 6, 7, 8, 9, 1, 2};
        tablica[1] = new int[]{6, 7, 2, 1, 9, 5, 3, 4, 8};
        tablica[2] = new int[]{1, 9, 8, 3, 4, 2, 5, 6, 7};
        tablica[3] = new int[]{8, 5, 9, 7, 6, 1, 4, 2, 3};
        tablica[4] = new int[]{4, 2, 6, 8, 5, 3, 7, 9, 1};
        tablica[5] = new int[]{7, 1, 3, 9, 2, 4, 8, 5, 6};
        tablica[6] = new int[]{9, 6, 1, 5, 3, 7, 2, 8, 4};
        tablica[7] = new int[]{2, 8, 7, 4, 1, 9, 6, 3, 5};
        tablica[8] = new int[]{3, 4, 5, 2, 8, 6, 1, 7, 9};

    }
}
