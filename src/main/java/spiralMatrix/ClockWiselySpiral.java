/*Spiral Matrix
        - imagine a matrix of 4 by 4 points
        - write an algorithm to traverse the matrix clockwise internally until you arrive at a center point
        - Ensure you output the node  position at each step of the traversal to verify the algorithm works
        */

package spiralMatrix;

import java.sql.SQLOutput;

public class ClockWiselySpiral {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}
        };

        System.out.println("even by even matrix");
        spiralPrint(mat,
                0, 0, mat[0].length -1,
                mat[0].length-1, 1, mat.length - 1,
                false, 1);

        int[][] mat2 = {
                {1, 2, 3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println("odd by odd matrix");
        spiralPrint(mat2,
                0, 0, mat2[0].length -1,
                mat2[0].length-1, 1, mat2.length - 1,
                false, 1);
    }
    static void spiralPrint(int[][] matrix, int rowIndex, int startCol, int stopCol, int colIndex,
                            int startRow, int stopRow,  boolean isreverse, int count) {
        horiTraversal(matrix, rowIndex, startCol, stopCol);

        //base case, even by even matrix stop condition
        if(count >= matrix.length) return;
        vertTraversal(matrix, colIndex, startRow, stopRow);

        isreverse = !isreverse;
        rowIndex = isreverse ? matrix.length-1-rowIndex : matrix.length-rowIndex;
        colIndex = isreverse ? matrix[0].length -1 -colIndex : matrix[0].length - colIndex -2;

        spiralPrint(matrix,
                rowIndex, isreverse? stopCol - 1: stopCol+1, startCol,
                colIndex, isreverse? stopRow - 1: stopRow + 1, startRow,
                isreverse,
                count + 1
                );
    }

    private static void horiTraversal(int[][] matrix, int row, int startCol, int stopCol) {
        if (startCol <= stopCol) {
            for (int i = startCol; i <= stopCol; i++)
                System.out.println(matrix[row][i]);
        } else {
            for (int i = startCol; i >= stopCol; i--)
                System.out.println(matrix[row][i]);
        }

    }

    static void vertTraversal(int[][] matrix, int col, int startRow, int stopRow) {
        if (startRow <= stopRow) {
            for (int i = startRow; i <= stopRow; i++)
                System.out.println(matrix[i][col]);
        } else {
            for (int i = startRow; i >= stopRow; i--)
                System.out.println(matrix[i][col]);
        }
    }

}
