package LeetCode.EasyLevel;

import com.sun.jdi.ArrayReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveAllNegativeElementsToEnd {
    public static void main(String[] args) {

        int arr[] = {-5 ,-2, 5, 2, 4, 7, 1, 8, 0, -8};
        //9 -2 4 -1 5 -5 0 -3 2
        List<Integer> negList = new ArrayList<>();
        List<Integer> posList = new ArrayList<>();


        int posIdx=0;
        int negIdx=0;


        for(int i =0; i<arr.length;i++){
            if(arr[i]<0){
                negList.add(arr[i]);
            }else{
                posList.add(arr[i]);
            }
        }

        if(posList.size()>negList.size()){
            for (int i = 0; i < negList.size(); i++) {
                arr[2*i]=posList.get(i);
                arr[2*i+1]=negList.get(i);
            }
             int idx = negList.size()*2;
            for (int i = negList.size(); i <posList.size() ; i++) {
                arr[idx]=posList.get(i);
                idx++;
            }
        }else {
            for (int i = 0; i < posList.size(); i++) {
                arr[2*i]=posList.get(i);
                arr[2*i+1]=negList.get(i);
            }
            int idx1 = posList.size()*2;
            for (int i = posList.size(); i <negList.size() ; i++) {
                arr[idx1]=negList.get(i);
                idx1++;
            }
        }


        System.out.println(Arrays.toString(arr));

    }
}
