package LeetCode.DailyLeetCode;

public class MakeTheStringGreat {
    public static void main(String[] args) {

        String s = "abBAcC";
        StringBuilder ansStr = new StringBuilder();

       for (char ch : s.toCharArray()){
           int len = ansStr.length();
           if(len > 0 && Math.abs(ansStr.charAt(len-1) -ch) == 32 ){
                ansStr.deleteCharAt(len-1);
           }
           else {
               ansStr.append(ch);
           }
       }

        System.out.println(ansStr);


    }
}
