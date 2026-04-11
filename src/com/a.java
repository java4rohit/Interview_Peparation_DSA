package com;

// {1,2,2,3,4,4,5}// 1, 2, +1, 1


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

// output : 2,4
public class  a{
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        HashSet<Integer>  set = new HashSet<>();
        boolean flag = false;
        for(int i = 0 ; i< list.size(); i++){
            if(!set.isEmpty()  && set.contains(list.get(i))){
                flag = true;
            }
            set.add(list.get(i));
            continue;

        }
        System.out.println(flag);
    }
}
