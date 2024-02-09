package LeetCode.EasyLevel;

public class Permutation {

    public static void main(String[] args) {

        String str = "abc";
        String ans = "";

        permu(str,ans);

    }

    private static void permu(String str, String ans) {

        if(str.length() == 0){
            System.out.println(ans);
        }

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            String  leftstr = str.substring(0,i);
            String  rightstr = str.substring(i+1);

            String strAns = leftstr+rightstr;

            permu(strAns,ans+ch);

        }
    }
}
