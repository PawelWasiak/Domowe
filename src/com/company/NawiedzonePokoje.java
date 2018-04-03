package com.company;
/*
After they became famous, the CodeBots all decided to move to a new building and live together. The building is
represented by a rectangular matrix of rooms. Each cell in the matrix contains an integer that represents the price
of the room. Some rooms are free (their cost is 0), but that's probably because they are haunted, so all the bots are
afraid of them. That is why any room that is free or is located anywhere below a free room in the same column is not
considered suitable for the bots to live in.
translator:
"Po tym jak stali się sławni, wszyscy CodeBots postanowili przenieść się do nowego budynku i wspólnie mieszkać. Budynek
jest reprezentowany przez prostokątną matrycę pomieszczeń. Każda komórka w macierzy zawiera liczbę całkowitą
reprezentującą cenę pokoju. Niektóre pokoje są bezpłatne (ich koszt to 0), ale to prawdopodobnie dlatego, że są
nawiedzone, więc wszystkie boty boją się ich. Dlatego każde pomieszczenie, które jest wolne lub znajduje się gdziekolwiek
poniżej wolnego pokoju w tej samej kolumnie, nie jest uważane za odpowiednie do życia w botach".

Help the bots calculate the total price of all the rooms that are suitable for them.

Example
For
matrix = [[0, 1, 1, 2],
          [0, 5, 0, 0],
          [2, 0, 3, 3]]
the output should be
matrixElementsSum(matrix) = 9.

Here's the rooms matrix with unsuitable rooms marked with 'x':

[[x, 1, 1, 2],
 [x, 5, x, x],
 [x, x, x, x]]
Thus, the answer is 1 + 5 + 1 + 2 = 9.
 */

public class NawiedzonePokoje {
    public static int[][] matrix = new int[3][];

    public static void main(String[] args) {
        matrix[0] = new int[]{1, 1, 1, 0};
        matrix[1] = new int[]{0, 5, 0, 1};
        matrix[2] = new int[]{2, 1, 3, 10};
        System.out.println(matrixElementsSum());
    }

    public static int matrixElementsSum() {
        int najem=0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j]==0 && i+1<matrix.length){
                    matrix[i+1][j]=0;
                }
                najem+=matrix[i][j];
            }
        }
return najem;
    }
}
