package com.company;
/*
Given two strings, find the number of common characters between them.

Example

For s1 = "aabcc" and s2 = "adcaa", the output should be
commonCharacterCount(s1, s2) = 3.

Strings have 3 common characters - 2 "a"s and 1 "c".
 */

public class WspolneZnaki {
    public static void main(String[] args) {
        String s1 = "aabcc";
        String s2 = "adcaa";

    }

    private static int commonCharacterCount(String s1, String s2) {
        char[] tablisaS1 = zamienNapisNaTablice(s1);
        char[] tablisaS2 = zamienNapisNaTablice(s2);
        int licznik = 0;
        for (int i = 0; i < tablisaS1.length; i++) {
            for (int j = 0; j < tablisaS2.length; j++) {
                if (tablisaS1[i] == tablisaS2[j]) {
                    licznik++;
                    tablisaS2 = usunElement(tablisaS2, j);
                    break;
                }
            }
        }
        return licznik;
    }

    private static char[] usunElement(char[] tablisaS2, int j) {
        char[] mniejszaTablica = new char[tablisaS2.length - 1];
        int k = 0;
        for (int i = 0; i < mniejszaTablica.length; i++) {
            if (i == j) {
                k++;
            }
            mniejszaTablica[i] = tablisaS2[k];
            k++;
        }
        return mniejszaTablica;
    }

    private static char[] zamienNapisNaTablice(String napis) {
        char[] tablica = new char[napis.length()];
        for (int i = 0; i < napis.length(); i++) {
            tablica[i] = napis.charAt(i);
        }
        return tablica;
    }

    private static void wyswietlTbalice(char[] tablisaS1) {
        for (char c : tablisaS1) {
            System.out.print(c + ", ");
        }
        System.out.println();
    }
}

