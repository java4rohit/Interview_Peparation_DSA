package com;

public class PacificAndAtalien {

    public static void main(String[] args) {



    }

    public  static   void pacificeOciean(int [][] directTwoAraay){

        int m = directTwoAraay.length;
        int n = directTwoAraay[0].length ;


          dfs(directTwoAraay, 2, 2);

    }

    public static void dfs(int[][] startTwoArray , int i , int j) {
        int m = startTwoArray.length;
        int n = startTwoArray[0].length ;

        if(startTwoArray[i][j] > startTwoArray[i][j+1]){
            dfs(startTwoArray,i, j+1);
            return;
        }
        else if(startTwoArray[i][j] > startTwoArray[i-1][j]){
            dfs(startTwoArray,i-1, j);
            return;
        } else if (startTwoArray[i][j] >startTwoArray[i-1][j] ) {
            dfs(startTwoArray,i-1, j);
            return;
        }
        else if (startTwoArray[i][j] >startTwoArray[i][j-1] ) {
            dfs(startTwoArray,i, j-1);
            return;
        }


    }
}
