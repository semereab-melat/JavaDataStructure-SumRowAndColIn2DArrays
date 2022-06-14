/*Write a method public static int[] allRowSums(int[][] a) that calculates the row sum for every row and returns each of the values in an array. Index i of the return array contains the sum of elements in row i.

Write a similar method public static int[] allColSums(int[][] a).

Write a method public static boolean isRowMagic(int[][] a) that checks if the array is row-magic (this means that every row has the same row sum).

Write a method public static boolean isColMagic(int[][] a) 
that checks if the array is column-magic (this means that every column has the same column sum)*/

import java.util.Random; // Random number generator class

class Main {
public static void main(String[] args) {

        int[][] rowmagic = new int[][]{  {1, 2, 3},
                                        {-1, 5, 2},
                                        {4, 0, 2}};

        int[][] colmagic = new int[][]{{1, -1, 4, 10},
                                        {3, 5, 0, -6}};
        int[] rowsum = allRowSums(rowmagic);
        int[] colsum = allColSums(colmagic);
       // System.out.println(Arrays.toString(rowsum));

        for (int i = 0; i < rowsum.length; i++)
            System.out.println("Sum Row " + (i + 1) + ":\t"+ rowsum[i]);

       for (int i = 0; i < colsum.length; i++)
            System.out.println("Sum Column " + (i + 1) + ":\t"+  colsum[i]);

        System.out.println("Is sum of row a row magic?\t" + isRowMagic(rowmagic));
        System.out.println("Is sum of column a row magic?\t" + isRowMagic(colmagic));

        System.out.println("Is sum of row a column magic?\t" + isColMagic(rowmagic));
        System.out.println("Is sum of column a column magic?\t" + isColMagic(colmagic));

    }

    public static int[] allRowSums(int[][] a){

        int[] temp = new int[a.length];
        for (int r = 0; r < a.length; r++){
            int sum = 0;
            for (int c = 0; c < a[r].length; c++){
                sum += a[r][c];
            }//for
           temp[r] = sum;
        }//for
        return temp;
    }

    public static int[] allColSums(int[][] a) {
        int[] temp = new int[a[0].length];

        for (int c = 0; c < a[0].length; c++) {
            int sum = 0;
            for (int r = 0; r < a.length; r++) {
                sum += a[r][c];
            }//for
            temp[c] = sum;
        }//for
        return temp;
    }//allColSums


    public static boolean isRowMagic(int[][] a) {
        //temporary array to compare the stored value
        int[] temp = new int[a.length];
        boolean isRowMagic = false;
        for (int r = 0; r < a.length; r++) {
            int sum = 0;
            for (int c = 0; c < a[r].length; c++) {
                sum += a[r][c];
            }//for
            temp[r] = sum;
        }//for
        //to compare the sums whether they are equal or not
        for (int i = 1; i < temp.length; i++) {
            int value = temp[0];
            if (temp[i] == value) {
                isRowMagic = true;
                return isRowMagic;
            }//if
        }//for
        return isRowMagic;
    }//isRowMagic()
    public static boolean isColMagic(int[][] a){
        //temporary array to compare the stored value
        int[] temp = new int[a[0].length];
        boolean isColumnMagic = false;
        for (int c = 0; c < a[0].length; c++) {
            int sum = 0;
        for (int r = 0; r < a.length; r++) {
                sum += a[r][c];
            }//for
            temp[c] = sum;
        }//for
        //to compare the sums whether they are equal or not
        for (int i = 1; i < temp.length; i++) {
            int value = temp[0];
            if (temp[i] == value) {
                isColumnMagic = true;
                return isColumnMagic;
            }//if
        }//for
        return isColumnMagic;
    }//isColMagic()

}//class