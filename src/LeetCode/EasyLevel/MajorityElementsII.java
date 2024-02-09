package LeetCode.EasyLevel;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementsII {
    public static void main(String[] args) {

        int arr[] = {1,1,1,3,3,2,2,2}; //n/3

        majorityElements(arr);
    }

    private static void majorityElements(int[] arr) {
        ///int arr[] = {1,1,1,1,3,3,2,2,2};
        List<Integer> integerList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(integerList.size()==0 ||integerList.get(0)!=arr[i] ) {
                int count = 0;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }

                if (count > arr.length / 3) {
                    integerList.add(arr[i]);
                }
            }

            if(integerList.size()==2){
                break;
            }

        }

        System.out.println(integerList);
    }
}
