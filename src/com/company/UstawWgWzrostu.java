package com.company;
/*
Some people are standing in a row in a park. There are trees between them which cannot be moved. Your task is to
rearrange the people by their heights in a non-descending order without moving the trees.
"
Niektórzy ludzie stoją w rzędzie w parku. Między nimi są drzewa, których nie można przenieść. Twoim zadaniem jest
 przestawienie ludzi według ich wysokości w niezmienionym porządku bez poruszania drzewami."
Example
For a = [-1, 150, 190, 170, -1, -1, 160, 180], the output should be
sortByHeight(a) = [-1, 150, 160, 170, -1, -1, 180, 190].
 */

import java.util.Arrays;

public class UstawWgWzrostu {
    public static void main(String[] args) {
        int[] park = new int[]{-1, 150, 190, 170, -1, -1, 160, 180};
        wyswietl(poustawiajOdNajniższego(park));
    }

    private static int[] poustawiajOdNajniższego(int[] park) {

        int ileDrzew = ileDrzew(park);
        int a=ileDrzew;
        int[] drzewa = gdzieDrzewa(park, ileDrzew);
        int[] posortowane = new int[park.length];
        Arrays.sort(park);
        for (int i = 0, j = 0, k = 0; i < park.length; i++) {
            if (j <a && i == drzewa[j]) {
                posortowane[i] = park[k];
                k++;
                j++;
            } else {
                posortowane[i] = park[ileDrzew];
                ileDrzew++;
            }
        }
        return posortowane;
    }

    private static int[] gdzieDrzewa(int[] park, int ileDrzew) {
        int gdzieDrzewa[] = new int[ileDrzew];
        for (int i = 0, j = 0; i < park.length; i++) {
            if (park[i] == -1) {
                gdzieDrzewa[j] = i;
                j++;
            }
        }
        return gdzieDrzewa;
    }

    private static int ileDrzew(int[] park) {
        int ileDrzew = 0;
        for (int i = 0; i < park.length; i++) {
            if (park[i] == -1) {
                ileDrzew++;
            }
        }
        return ileDrzew;
    }

    private static void wyswietl(int[] tablica) {
        for (int i : tablica) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
