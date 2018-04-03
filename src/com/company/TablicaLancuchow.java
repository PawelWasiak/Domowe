package com.company;

/*
Given an array of strings, return another array containing all of its longest strings.
"Biorąc pod uwagę tablicę łańcuchów, zwróć inną tablicę zawierającą wszystkie jej najdłuższe łańcuchy"
Example
For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
allLongestStrings(inputArray) = ["aba", "vcd", "aba"].
 */
public class TablicaLancuchow {
    private static String[] tablica = new String[]{"abaaa", "aaa", "ad", "vcd", "aba"};

    public static void main(String[] args) {
        allLongestStrings();
    }

    public static String[] allLongestStrings() {
        wyswietlTablice(tablica);
        int najduzszyLancuch = znajdzNajdluzszy();
        int policzIleNajdluzszych = policzIleNajdluzszych(najduzszyLancuch);
        String[] nowaTablica = new String[policzIleNajdluzszych];
        for (int i = 0, j = 0; i < tablica.length; i++) {
            if (tablica[i].length() == najduzszyLancuch) {
                nowaTablica[j] = tablica[i];
                j++;
            }
        }
        wyswietlTablice(nowaTablica);
        return nowaTablica;
    }

    private static int policzIleNajdluzszych(int najduzszyLancuch) {
        int licznik = 0;
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i].length() == najduzszyLancuch) {
                licznik++;
            }
        }
        return licznik;
    }

    private static int znajdzNajdluzszy() {
        int najdluzszyLancuch = tablica[0].length();
        for (int i = 1; i < tablica.length; i++) {
            if (najdluzszyLancuch < tablica[i].length()) {
                najdluzszyLancuch = tablica[i].length();
            }
        }
        return najdluzszyLancuch;
    }

    public static void wyswietlTablice(String[] tablica) {
        for (String s : tablica) {
            System.out.print(s + ", ");
        }
        System.out.println();
    }
}
