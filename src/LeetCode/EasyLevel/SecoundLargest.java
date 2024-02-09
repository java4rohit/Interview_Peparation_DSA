package LeetCode.EasyLevel;

public class SecoundLargest {

    public static void main(String[] args) {

        int [] arr = {6,4,3,8,9,1,2,0,5};
        System.out.println(arr.length);

        int largest = arr[0];
        int secoundLargest = arr[0];

         for(int i =1; i <arr.length; i++){
              if(largest<arr[i]){
                  secoundLargest=largest;
                  largest=arr[i];
              }
         }
        System.out.println(largest);
        System.out.println(secoundLargest);

    }
}
