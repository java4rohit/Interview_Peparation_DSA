package DataStrutureAndALgo.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
         int [] n = {1,2,3};
        List<Integer> list =Arrays.stream(n).boxed().collect(Collectors.toList());
        System.out.println(list);
        //System.out.println(n1);
    }
}
