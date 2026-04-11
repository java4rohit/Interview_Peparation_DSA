package LeetCode.EasyLevel;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("(([]))"));
    }

    public static boolean isValid(String s) {

        Stack<Character> stk = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                  stk.push(c);
            } else if (stk.empty()) {
                return false;
            } else {
               char c1= stk.pop();
                if ((c == '}' && c1 == '{') || (c == ']' && c1 == '[') || (c == ')' && c1 == '(')) {
                    continue;
                }else {
                    return false;
                }
            }

        }
        System.out.println(stk);
        return stk.empty();

    }
}
