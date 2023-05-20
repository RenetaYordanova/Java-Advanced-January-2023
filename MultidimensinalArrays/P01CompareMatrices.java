package MultidimensinalArrays;

import java.util.Scanner;

public class P01CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String[] inputDimension=scanner.nextLine().split(" ");
        int firstRow=Integer.parseInt(inputDimension[0]);
        int firstCols=Integer.parseInt(inputDimension[1]);
        int [][]firstMatrix=new int[firstRow][firstCols];

        for (int i = 0; i < firstRow; i++) {
            String[]parts=scanner.nextLine().split(" ");

            for (int j = 0; j < firstCols; j++) {
                firstMatrix[i][j]=Integer.parseInt(parts[j]);
            }
        }

        inputDimension = scanner.nextLine().split(" ");
        int secondRows = Integer.parseInt(inputDimension[0]);
        int secondCols = Integer.parseInt(inputDimension[1]);
        int[][] secondMatrix = new int[secondRows][secondCols];

        for (int i = 0; i < secondRows; i++) {
            String[] parts = scanner.nextLine().split(" ");

            for (int j = 0; j < secondCols; j++) {
                secondMatrix[i][j] = Integer.parseInt(parts[j]);
            }
        }

        if(firstRow!=secondRows||firstCols!=secondCols){
            System.out.println("not equal");
            return;
        }

        boolean areEqual=true;
        for (int row = 0; row < firstRow; row++) {
            for (int cols = 0; cols < firstCols; cols++) {
                if(firstMatrix[row][cols]!=secondMatrix[row][cols]){
                    areEqual=false;
                    break;
                }
            }

            if(!areEqual){
                break;
            }

        }

        if(areEqual){
            System.out.println("equal");
        }else {
            System.out.println("not equal");

        }

    }
}
