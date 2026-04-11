package StackAndQueue;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemparature {
    public static void main(String[] args) {

        int []arr = {73,74,75,71,69,72,76,73};

        int[] ans= dailyTemperaturesSol(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] dailyTemperaturesSol(int[] t) {

        Stack<Integer> stack = new Stack<>();
        int ans[] = new int[t.length];
        for (int i = t.length - 1; i >= 0; i--) {
            int count = 0;
            if (!stack.isEmpty()){
                if (stack.peek() > t[i]){
                    count++;
                    ans[i] = count;
                }
                else{
                    count++;
                }
            }
            else{
                ans[i] = 0;
            }
            stack.push(t[i]);
        }

        return ans;
    }
}
