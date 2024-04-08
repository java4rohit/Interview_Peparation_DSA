package LeetCode.EasyLevel;

public class MaxSubArrayProduct {
    private static Long maxSubArrayProduct(int[] nums) {


        int pree = 1;
        int suff = 1;
        long ans = Integer.MIN_VALUE;

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
        int nums[] = {3 ,12, 15, 23, 33, -35, 30, -40, -30, -30, -30, 26, 28};
        Long i = maxSubArrayProduct(nums);
        System.out.println(i);
    }


}
