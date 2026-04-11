import java.util.HashMap;
import java.util.Map;

/*
* INPUT :AAAAABBCC

  OUTPUT : 5A2B2C

*
* */
public class Test {

    public static void main(String[] args) {
        String input = "AAAAABBCC";
        Map<Character,Integer> map = new HashMap<>();
         for( char ch : input.toCharArray()){
             map.put(ch, map.getOrDefault(ch,0)+1);
         }
         StringBuilder output  = new StringBuilder();
         for (Map.Entry<Character,Integer> entry : map.entrySet()){
             output.append(entry.getValue()).append(entry.getKey());
         }
        System.out.println("OUTPUT : "+output);
    }
}
