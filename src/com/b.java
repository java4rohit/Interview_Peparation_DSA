package com;

import java.util.Arrays;

// int n = 5;
// arr = {1,2,2,3,4}
// output : {2,5}
public class b {
    public static void main(String[] args) {

        int arr[] = {1,2,2,3,3,5};


        int sizeLength = arr.length;
        int []countOfans = new int[sizeLength +1];

      //  int totalSum = 0; // 15
       // int atualSum = 0;

        for(int num : arr){
            countOfans[num]++;
        }
        System.out.println("countOfans : "+ Arrays.toString(countOfans));


        int repetingNumber = -1;
        int missingNumber  = -1;

        for(int i = 1; i<=sizeLength; i++){
           if(countOfans[i] == 2){
               repetingNumber = i;
           } else if (countOfans[i] == 0) {
               missingNumber = i;
           }
        }

        System.out.println("repetingNumber : "+repetingNumber);
        System.out.println("missingNumber : "+missingNumber);







    }/*

    class Rohit(){
       write(){
       }

    }

    //

     @Configuration
     class config(){

        @Bean
        pulicb Rohit rohit(){
        return new Rohit();
        }
     }




    */
}
