package LeetCode.EasyLevel;

import java.util.Arrays;

public class ReverseVowel {


    public static void main(String[] args) {
        String s = "leetcode";
        reverseVowels(s);
    }

    public static String reverseVowels(String s) {
        char[] charr = s.toCharArray();
        int i =0;
        int j =charr.length-1;
        while (i < j) {
            if ((charr[i] == 'a' || charr[i] == 'e' || charr[i] == 'i' || charr[i] == 'o' || charr[i] == 'u' || charr[i] == 'A' || charr[i] == 'E' || charr[i] == 'I' || charr[i] == 'O' || charr[i] == 'U' )&&( charr[j] == 'a' || charr[j] == 'e' || charr[j] == 'i' || charr[j] == 'o' || charr[j] == 'u' || charr[j] == 'A' || charr[j] == 'E' || charr[j] == 'I' || charr[j] == 'O' || charr[j] == 'U')){

                char temp = charr[j];
                charr[j] = charr[i];
                charr[i] = temp;
                i++;
                j--;

            }
            else if(charr[i] == 'a' || charr[i] == 'e' || charr[i] == 'i' || charr[i] == 'o' || charr[i] == 'u' || charr[i] == 'A' || charr[i] == 'E' || charr[i] == 'I' || charr[i] == 'O' || charr[i] == 'U'){
                j--;
            }
            else if(charr[j] == 'a' || charr[j] == 'e' || charr[j] == 'i' || charr[j] == 'o' || charr[j] == 'u' || charr[j] == 'A' || charr[j] == 'E' || charr[j] == 'I' || charr[j] == 'O' || charr[j] == 'U'){
                i++;
            }

            else{
                i++;
                j--;
            }

        }

        String re = new String(charr);
        return re;

    }
}
