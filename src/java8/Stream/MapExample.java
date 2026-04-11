package java8.Stream;

import java.util.Arrays;
import java.util.List;

public class MapExample {

    public static void main(String[] args) {
        List<List<String>> listOfList = Arrays.asList(Arrays.asList("a","b"),
                                                      Arrays.asList("c","d"),
                                                      Arrays.asList("e","f"));

        listOfList.stream().flatMap(l->l.stream()).forEach(System.out::println);


    }
}
