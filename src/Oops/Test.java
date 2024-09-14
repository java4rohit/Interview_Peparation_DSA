package Oops;
/*
Write a java program to find whether the given user input is balanced or not:
Sample Input :  {{{}}}
Sample output : Balanced
Sample Input :  }}}{{{
Sample output : Unbalanced
Sample Input :  }{}{}{}{
Sample output : Unbalanced
 */


import java.util.Scanner;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String output = "";

        Stack<Character> stk  = new Stack<>();

        for(int i = 0 ;  i< input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stk.push(ch);
            }
            if (stk.isEmpty()) {
                output = "Unbalanced";
            } else if ((stk.peek() == '(' && ch == ')') || (stk.peek() == '{' && ch == '}') || (stk.peek() == '[' && ch == ']')) {
                stk.pop();
            }
        }
        if(output.equalsIgnoreCase("Unbalanced")){
            System.out.println(output);
        }
        else if(!stk.isEmpty()){
            System.out.println("Unbalanced");
        }
        if(stk.isEmpty()){
            System.out.println("Balanced");
        }

    }
}
