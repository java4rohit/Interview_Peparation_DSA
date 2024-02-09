package LeetCode.EasyLevel;

import java.util.Arrays;
import java.util.List;

public class findElement {

    public static void main(String[] args) {

        List<Integer> intList  = Arrays.asList(1,2);
        int key = 5;


      boolean b =   findNumber(intList,key);

        System.out.println(b);
    }

    private static boolean findNumber(List<Integer> intList,int k) {

        for (int i = 0; i < intList.size(); i++) {
            int searchElement = k - intList.get(i);

            if(intList.contains(searchElement)){
                return true;
            }
        }
        return false;
    }
}
