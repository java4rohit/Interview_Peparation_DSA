package Circana;

import java.util.*;

/*
Map<String, String> map = new HashMap<>();
map.put("five","five_5");
map.put("two","two_2");
map.put("twelve","twelve_12");
map.put("eight","eight_8");
map.put("ten","ten_10");
map.put("four","four_4");

//after sorting

map.put("two","two_2");
map.put("four","four_4");
map.put("five","five_5");
map.put("eight","eight_8");
map.put("ten","ten_10");
map.put("twelve","twelve_12");

 */
public class Question1 {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("five","five_5"); //five_5 --> _ -> "5" -> (int)5  ->o1
        map.put("two","two_2");//five_5 --> _ -> "5" -> (int)5  -> o2
        map.put("twelve","twelve_12");
        map.put("eight","eight_8");
        map.put("ten","ten_10");
        map.put("four","four_4");

        ArrayList<Map.Entry<String, String>> entries = new ArrayList<>(map.entrySet());
        Collections.sort(entries,(o1,o2)-> {
                int val1 = Integer.parseInt(o1.getValue().split("_")[1]);
                int val2 = Integer.parseInt(o2.getValue().split("_")[1]);
                return val1 - val2;
        });

        Map<String,String> linkedSortedMap = new LinkedHashMap<>();
        for(Map.Entry<String, String> entry : entries) {
            linkedSortedMap.put(entry.getKey(), entry.getValue());
        }
        System.out.println(linkedSortedMap);
    }
}
