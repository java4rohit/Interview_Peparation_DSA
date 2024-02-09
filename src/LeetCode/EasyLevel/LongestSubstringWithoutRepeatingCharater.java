package LeetCode.EasyLevel;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharater {

    public static void main(String[] args) {

        String s = "pwwkew";

         LSWRC(s);
    }

    private static void LSWRC(String s) {
        int release=0;
        int aqueire =0;
        int max = 0;
        StringBuffer str = new StringBuffer();

        Set<Character> charSet = new HashSet<>();

        while(aqueire<s.length()){

            if(!charSet.contains(s.charAt(aqueire))){
                charSet.add(s.charAt(aqueire));
                aqueire++;
                if(max < charSet.size()){
                    max=charSet.size();

                }


            }
            else {

               charSet.remove(s.charAt(release));
               release++;
            }

        }

        System.out.println(max);
        System.out.println(str);

    }
}
