package Catalan_Number;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) {

        int n = 3;

        List<String>[] dp = new List[n + 1];
        dp[0] = Arrays.asList("");
        dp[1] = Arrays.asList("()"); // 🔧 Added initialization for dp[1]

        for (int i = 2; i <= n; i++) {
            dp[i] = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                int inner = j;
                int outer = i - j - 1;
                for (String inn : dp[inner]) {
                    for (String out : dp[outer]) {
                        dp[i].add("("+inn+")"+out);
                    }
                }
            }

        }

        List<String> m=  dp[n];


    }
}
