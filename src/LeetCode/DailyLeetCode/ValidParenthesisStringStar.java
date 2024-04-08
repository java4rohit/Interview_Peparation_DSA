package LeetCode.DailyLeetCode;

import java.util.Stack;

public class ValidParenthesisStringStar {

    public static void main(String[] args) {

        String  s = "(((((*(()((((*((**(((()()*)()()()*((((**)())*)*)))))))(())(()))())((*()()(((()((()*(())*(()**)()(())";
        Stack<Integer> brkStack = new Stack<>();
        Stack<Integer> strStack = new Stack<>();

         boolean flag = validParam(s, brkStack, strStack);
         System.out.println(flag);
    }

    private static boolean validParam(String s, Stack<Integer> brkStack, Stack<Integer> strStack) {

        for(int i = 0; i< s.length(); i++){
            char ch = s.charAt(i);
            if(ch == ')' && brkStack.empty() && strStack.empty()){
                return false;
            }
            if (ch == '(' ) {
                brkStack.push(i);
            }else if (ch == '*') {
                strStack.push(i);
            }else  {
                // closing braket )
                if(!brkStack.empty()) {
                    brkStack.pop();
                }
                else if(!strStack.empty()) {
                    strStack.pop(); // pop extra start
                }
                else{
                    return  false;
                }
            }
        }
        System.out.println("brkStack: "+brkStack);
        System.out.println("brkStack: "+strStack);

         while (!brkStack.empty()){
             if(strStack.empty()){
                 return  false;
             }
             if (brkStack.pop()> strStack.pop()) { // confusing'
                 return  false;
             }
         }


         return  brkStack.empty();

    }

}
