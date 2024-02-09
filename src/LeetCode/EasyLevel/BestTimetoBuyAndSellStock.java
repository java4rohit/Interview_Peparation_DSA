package LeetCode.EasyLevel;

public class BestTimetoBuyAndSellStock {

    public static void main(String[] args) {
        int[] arr = {7,1,5,10,6,4};
        int mmm = maxProfit(arr);

        System.out.println(mmm);
    }

    public static int maxProfit(int[] price) {


        int maxProfit = 0;
        int maxProfitToday = 0;
        int buyToday = Integer.MAX_VALUE;
        for (int i = 0; i < price.length - 1; i++) {
            if(buyToday > price[i]){
                buyToday =  price[i];
            }
            maxProfitToday = price[i] - buyToday;
            if(maxProfitToday > maxProfit){
                maxProfit = maxProfitToday;
            }

        }
        return maxProfit;
    }
}


