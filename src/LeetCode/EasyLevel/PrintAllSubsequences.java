package LeetCode.EasyLevel;

import java.util.ArrayList;

public class PrintAllSubsequences {

    public static void main(String[] args) {
        String str = "abc";
        //ArrayList<String> ans =    getAllSubsequence(str);
        //System.out.println(ans);
        printAllSubSequence(str,"");
    }

    private static ArrayList<String> getAllSubsequence(String str) {

        if (str.length() == 0) {
            ArrayList<String>  bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rres = getAllSubsequence(ros);
        ArrayList<String> ansResult  = new ArrayList<>();
        for(String rstr : rres){
            ansResult.add(""+rstr);
            ansResult.add(ch + rstr);
        }
        return ansResult;

    }
    private static void printAllSubSequence(String str, String ans) {

        ArrayList<String> arrayList = null;
        if (str.length() == 0) {
            //arrayList = new ArrayList<>();
            //arrayList.add(ans);
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);
        printAllSubSequence(ros, ans + "");
        printAllSubSequence(ros, ans + ch);

    }
}
