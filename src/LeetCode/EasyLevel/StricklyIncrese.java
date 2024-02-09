package LeetCode.EasyLevel;

import java.util.Arrays;

public class StricklyIncrese {
    public static void main(String[] args) {

      int nums[] = {1,2,10,5,7};

        boolean stklyincre = stklyincre(nums);

        System.out.println(stklyincre);
    }

    private static boolean stklyincre(int[] nums) {
        int count =0;
        for(int i = 1; i< nums.length; i++){
            if(nums[i]<= nums[i-1]){

                if(count == 1){
                    return false;
                }
                count++;
                if(nums[i]<= nums[i-2]){
                    nums[i] = nums[i-1];
                }

            }

        }
        return true;
    }
}
