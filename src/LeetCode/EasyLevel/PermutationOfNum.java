package LeetCode.EasyLevel;

import java.util.ArrayList;
import java.util.List;

public class PermutationOfNum {


    public static void main(String[] args) {
        int arr[] = {1,2,3};

        List<List<Integer>> ansLists = new ArrayList<>();

        List<List<Integer>> lists = permutataionList(ansLists, new ArrayList<>(), arr);
        System.out.println(lists);
    }

    private static List<List<Integer>> permutataionList(List<List<Integer>> ansLists, ArrayList<Integer> tempList , int[] arrs) {

        if(tempList.size() == arrs.length){
            ansLists.add(new ArrayList<>(tempList));
        }

        for(int arr : arrs){
            if(tempList.contains(arr)){
                continue;
            }
            //_add
            tempList.add(arr);
            //_go_Back
            permutataionList(ansLists,tempList,arrs);
            //_remove
            tempList.remove(tempList.size()-1);

        }

        return ansLists;
    }

}
