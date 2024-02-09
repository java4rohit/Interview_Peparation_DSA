package LeetCode.EasyLevel;

public class LongestCommonPrefix {

    public static void main(String[] args) {

        String[] str = {"LeetCode","Lead","Leet"};


        String prefix = str[0];
         for(int i =0 ; i<str.length; i++) {

             while(str[i].indexOf(prefix) != 0) {
                 prefix = prefix.substring(0,prefix.length()-1);
                 if(prefix.isEmpty()){
                     System.out.println("");
                 }
             }

         }
        System.out.println(prefix);
    }


}
