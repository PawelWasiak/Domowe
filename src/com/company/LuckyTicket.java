package com.company;
/*
Ticket numbers usually consist of an even number of digits. A ticket number is considered lucky if the
 sum of the first half of the digits is equal to the sum of the second half.
"
Numery biletów zazwyczaj składają się z parzystej liczby cyfr. Numer biletu jest uważany za szczęśliwy,
 jeśli suma pierwszej połowy cyfr jest równa sumie drugiej połowy."
Given a ticket number n, determine if it's lucky or not.

Example

For n = 1230, the output should be
isLucky(n) = true;
For n = 239017, the output should be
isLucky(n) = false.
 */

public class LuckyTicket {
    public static void main(String[] args) {
        int n = 1230;
        isLucky(n);
    }

    //prosciej by było zamienic liczbe na tablice z cyframi i zsumować najpierw pierwsza połowę, później drugą, ale nie
// nie chciałem z tego korzystać.
    static boolean isLucky(int n) {
        int dlugosc = policzIleMaCyfr(n);
        int pierwszaSuma = 0;
        int drugaSuma = 0;
        for (int i = 0; i < (dlugosc + 1); i++) {
            double zmienna = (Math.pow(10, dlugosc - i));
            if (i <= (dlugosc / 2)) {
                pierwszaSuma += n / zmienna;
            } else {
                drugaSuma += n / (Math.pow(10, (dlugosc) - i));
            }
            n -= (int) (n / zmienna) * zmienna;
        }
        return pierwszaSuma == drugaSuma;
    }


    private static int policzIleMaCyfr(int n) {
        int dlugosc = 0;
        for (int i = 10; i < n; i *= 10) {
            dlugosc++;
        }
        return dlugosc;
    }
}
