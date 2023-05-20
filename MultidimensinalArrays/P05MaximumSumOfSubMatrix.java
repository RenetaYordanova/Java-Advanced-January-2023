package MultidimensinalArrays;

import java.util.Scanner;

public class P05MaximumSumOfSubMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String[] rowsAndCols = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(rowsAndCols[0]);
        int cols = Integer.parseInt(rowsAndCols[1]);
        int[][] table = new int[rows][cols];


        for (int row = 0; row < rows; row++) {
            String[] columnData = scanner.nextLine().split(", ");

            for (int col = 0; col < cols; col++) {
                table[row][col] = Integer.parseInt(columnData[col]);
            }
        }
           int maxLeftSumRow=-1;
           int maxLeftSumCol=-1;

        int maxSum=Integer.MIN_VALUE;
        for (int row = 0; row < table.length-1; row++) {
            for (int col = 0; col < table[row].length-1; col++) {
                int currentSum=table[row][col]+ table[row][col+1]+
                        table[row+1][col]+table[row+1][col+1];

                if(currentSum>maxSum) {
                    maxSum = currentSum;

                    maxLeftSumRow = row;
                    maxLeftSumCol = col;
                }
            }
            
        }

        System.out.println(table[maxLeftSumRow][maxLeftSumCol] + " " + table[maxLeftSumRow][maxLeftSumCol + 1]);
        System.out.println(table[maxLeftSumRow + 1][maxLeftSumCol] + " " + table[maxLeftSumRow + 1][maxLeftSumCol + 1]);
        System.out.println(maxSum);



    }
}
