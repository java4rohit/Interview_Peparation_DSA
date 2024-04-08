package DataStrutureAndALgo.TwoDArrays;

import java.util.Scanner;

public class Iterate2DArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        int n = scanner.nextInt();
//        int m = scanner.nextInt();

        int[][] twoDArray = {{1, 0, 3}, {4, 5, 6}, {7, 8, 9}};
        print2dMatrix(twoDArray);
        System.out.println("print before -->");
        int[][] ints = convertMatrix(twoDArray);
        finalMatrix(ints);
        print2dMatrix(ints);
    }

    private static void print2dMatrix(int[][] twoDArray) {


        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] convertMatrix(int[][] twoDArray) {
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                if(twoDArray[i][j]==0){

                    for (int k = 0; k< twoDArray.length; k++) {
                       if(twoDArray[i][k]!=0){
                           twoDArray[i][k]=-1;
                       }
                    }
                    for (int k = 0; k< twoDArray[i].length; k++) {
                        if(twoDArray[i][k]!=0){
                            twoDArray[k][j]=-1;
                        }
                    }

                }
            }
        }

        return twoDArray;
    }


    private static void finalMatrix(int[][] twoDArray) {


        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                if(twoDArray[i][j]==-1){
                    twoDArray[i][j]=0;
                }
            }
            System.out.println();
        }
    }




}
