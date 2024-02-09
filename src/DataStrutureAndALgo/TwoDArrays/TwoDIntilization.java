package DataStrutureAndALgo.TwoDArrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDIntilization {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*int n = scanner.nextInt();
        int m = scanner.nextInt();*/

        int n = 3 , m = 4;

       // int [][] twoDArray = new int[n][m];

       /* for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                twoDArray[i][j]= scanner.nextInt();
            }
        }*/
         Character [][]twoDArray = {{'a','b','c'},{'d','e','f'},{'g','h','i'}};

/////////Print all martix

        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                System.out.print(twoDArray[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("=================================================");

//-------------->Transpose Of Matrix:::
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = i; j < twoDArray[i].length; j++) {
                Character temp = twoDArray[i][j];
                twoDArray[i][j]=twoDArray[j][i];
                twoDArray[j][i]=temp;
            }
        }

        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                System.out.print(twoDArray[i][j]+" ");
            }
            System.out.println();
        }
/// Reverse -------------------------->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        for (int i = 0; i < twoDArray.length; i++) {

            int li =0;
            int ri = twoDArray[i].length-1;

            while (li<ri){
                char temp = twoDArray[i][li];
                twoDArray[i][li] = twoDArray[i][ri];
                twoDArray[i][ri] = temp;

                li++;
                ri--;
            }

        }
        System.out.println("=============REVERSE ====================================");
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                System.out.print(twoDArray[i][j]+" ");
            }
            System.out.println();
        }


    }
}
