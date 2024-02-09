import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Test {
    public static void main(String[] args) {
        //  INput :[1,2,2,2,3,4,5,5,6,6,6,6,7]
        //  Output: 2-3,5-2,6-4

          int [] arr =  {1,2,2,2,3,4,5,5,6,6,6,6,7};

        ConcurrentHashMap<Integer,Integer> keyValueCountMap = new ConcurrentHashMap<>();
        for (int i = 0; i < arr.length; i++) {

            keyValueCountMap.put(arr[i], keyValueCountMap.getOrDefault(arr[i],0)+1);

        }
        for (Map.Entry<Integer,Integer> entry: keyValueCountMap.entrySet()){
            if(entry.getValue() == 1){
                keyValueCountMap.remove(entry.getKey());
            }
        }

        System.out.println(keyValueCountMap);

    }
}