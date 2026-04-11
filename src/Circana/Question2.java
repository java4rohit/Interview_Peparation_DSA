package Circana;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Input:

        [7,5,6,6,8,6,5,2,3,5,4,4]
        0 1 2 3 4 5 6 7 8 9 10 11

Output:
        {
        7 : -1,
        5 : 3,
        6 : 1,
        8 : -1,
        2 : -1,
        3 : -1,
        4 : 1
        }
        */
//i = 0
//map2lastSeenIndex.contains(arr[i])
//mapmindistance ->

//map2lastSeenIndex-> this map will store num and index lastest
public class Question2 {

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(7,5,6,6,8,6,5,2,3,5,4,4);

        Map<Integer,Integer> minDistance = new HashMap<>();
        Map<Integer,Integer> lastIndexSeen = new HashMap<>();

        for(int i =0 ; i< input.size() ; i++){
            int num = input.get(i);
            if(lastIndexSeen.containsKey(num)){
              int prevIndex =  lastIndexSeen.get(num); // 1
              int newDistanceIndex = i- prevIndex; // 5-1= 4
              minDistance.put(num,
                        Math.min(minDistance.get(num),
                                newDistanceIndex));
            }else{
                minDistance.put(num,-1);
            }
            lastIndexSeen.put(num,i);
        }

    }
}
