package com.company;
/*

Given a sequence of integers as an array, determine whether it is possible to obtain a
strictly increasing sequence by removing no more than one element from the array.
"Biorąc pod uwagę sekwencję liczb całkowitych jako tablicę, określ, czy możliwe jest uzyskanie a
sekwencja ściśle rosnąca poprzez usunięcie nie więcej niż jednego elementu z tablicy."
For sequence = [1, 3, 2] - true
sequence: [1, 2, 5, 5, 5]  - false
For sequence = [1, 3, 2, 1] - false
sequence: [1, 1, 1, 2, 3]   - false
sequence: [123, -17, -5, 1, 2, 3, 12, 43, 45] - true
sequence: [1, 2, 3, 4, 99, 5, 6] - true
sequence: [1, 2, 3, 4, 5, 3, 5, 6] - false

 */

public class Narastajace {
    public static void main(String[] args) {
        int statues[] = new int[]{3, 5, 67, 98, 3};
        System.out.println(almostIncreasingSequence(statues));

    }

    public static boolean almostIncreasingSequence(int[] sequence) {
        int porownywana = sequence[0];
        int licznik = 0;
        for (int i = 1; i < sequence.length; i++) {

            if (porownywana >= sequence[i]) {
                System.out.println(porownywana + "  " + i);
                if (usunElement(i, sequence) || usunElement(i - 1, sequence)) {
                    return true;
                } else {
                    return false;
                }

            } else {
                porownywana = sequence[i];
            }
        }
        return true;
    }

    private static boolean usunElement(int i, int[] sequence) {

        int mniejsza[] = stworzMniejsza(i, sequence);
        wyswietlTablice(mniejsza);
        int porownywana = mniejsza[0];
        for (int j = 1; j < mniejsza.length; j++) {
            if (porownywana >= mniejsza[j]) {
                return false;
            }
            porownywana = mniejsza[j];
        }
        return true;
    }

    private static int[] stworzMniejsza(int indeks, int[] sequence) {
        System.out.println();
        int mniejsza[] = new int[sequence.length - 1];
        int licznik = 0;
        for (int i = 0; i < mniejsza.length; i++) {
            if (i == indeks) {
                licznik++;
            }
            mniejsza[i] = sequence[licznik];
            licznik++;
        }
        return mniejsza;
    }

    public static void wyswietlTablice(int[] tablica) {
        for (int i : tablica) {
            System.out.print(i + ", \t");
        }
    }
}

