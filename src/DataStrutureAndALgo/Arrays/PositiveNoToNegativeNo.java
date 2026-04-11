package DataStrutureAndALgo.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class PositiveNoToNegativeNo {
    public static void main(String[] args) {

        Integer[] arr = {-1, 0, 1, 2, -1, 0};
        Arrays.sort(arr);

        ArrayList<ArrayList<Integer>> al = new ArrayList<>();

        HashSet<Integer> setInt = new HashSet<>();

        for (int num : arr) {
            ArrayList<Integer> li = new ArrayList<>();
            if (setInt.contains(0 - num)) {

                li.add(0 - num);
                li.add(num);

                al.add(li);

                setInt.remove(num);
                setInt.remove(0 - num);
            } else {
                setInt.add(num);
            }
        }
        al.sort((a, b) -> Integer.compare(a.get(0), b.get(0)));
        System.out.println(al);
    }
}
