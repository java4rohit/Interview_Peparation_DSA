package LeetCode.EasyLevel;

public class MaxSubArrayProduct {
    private static int maxSubArrayProduct(int[] nums) {


        int pree = 1;
        int suff = 1;
        int ans = 0;

        for(int i = 0; i <nums.length ; i++){
            if(pree == 0) {
                pree = 1;
            }

            if(suff == 0) {
                suff = 1;
            }
            pree = pree * nums[i];
            suff = suff * nums[nums.length-i-1];

          ans = Math.max(ans,Math.max(pree,suff));

        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {2,3,-2, 4};
        int i = maxSubArrayProduct(nums);
        System.out.println(i);
    }


}
