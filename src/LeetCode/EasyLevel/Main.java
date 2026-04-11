package LeetCode.EasyLevel;

import java.util.HashMap;
import java.util.Map;

class Main {
    public static void main(String[] args) {
    
    String s = "abcab";
       Map<Character, Integer> freqMap = new HashMap<>();

     for(int i = 0 ; i<s.length(); i++){
       if(freqMap.containsKey(s.charAt(i))){
         freqMap.put(s.charAt(i),freqMap.get(s.charAt(i)));
       }else{
        freqMap.put(s.charAt(i),0);
       }
    }
    
           
       System.out.println(freqMap);
   }
}
