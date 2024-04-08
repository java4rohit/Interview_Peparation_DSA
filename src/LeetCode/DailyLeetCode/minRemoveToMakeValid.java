package LeetCode.DailyLeetCode;

import java.util.Stack;

public class minRemoveToMakeValid {
    public static void main(String[] args) {

        String s = "a)b(c)d";
        Stack<Integer> stk = new Stack();
        StringBuilder sb = new StringBuilder();
        // System.out.println("sb :: "+sb);

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stk.push(i);
            } else if (ch == ')' && !stk.empty()) {
                if (s.charAt(stk.peek()) == '(') {
                    stk.pop();
                } else {
                    stk.push(i);
                }
            } else if (ch == ')' && stk.empty()) {
                stk.push(i);
            }
        }
        System.out.println("stck index :: " + stk);

        for (int i = s.length() - 1; i >= 0; i--) {

            if (!stk.empty()) {
                System.out.println(stk.peek() +":"+i);
                if (stk.peek() != i) {
                    sb.append(s.charAt(i));
                }
                else{
                    stk.pop();
                }
            } else {
                sb.append(s.charAt(i));
            }
            // System.out.println(i);
        }

        System.out.println(sb.reverse());

    }
}
