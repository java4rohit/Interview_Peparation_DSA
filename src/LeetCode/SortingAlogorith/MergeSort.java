package LeetCode.SortingAlogorith;


import java.util.Arrays;

//time Complexcity - Big o NlogN
// space Complexcity-
public class MergeSort {
    private static int[] mergeSort(int[] arrs,int low,int high) {

        if(low==high){
            int []ba = new int[1];
            ba[0] = arrs[low];
            return ba;
        }
        int mid =  low+(high-low)/2;
        int[] fsa = mergeSort(arrs,low,mid);
        int [] ssa = mergeSort(arrs,mid+1,high);
        int [] fulSortedArray = mergerTwoSortArray(fsa,ssa);

        System.out.println("fulSortedArray: "+Arrays.toString(fulSortedArray));
        return fulSortedArray;
    }


    public static int[] mergerTwoSortArray(int[] fsa, int[] ssa){

        int i = 0;
        int j =0;
        int [] sortArray = new int[(fsa.length)+(ssa.length)];

        int k =0;
        while(i<fsa.length && j<ssa.length){

            if(fsa[i]<=ssa[j]){
                sortArray[k] = fsa[i];
                i++;
                k++;
            }
            else{
                sortArray[k] = ssa[j];
                j++;
                k++;
            }
        }
        while(i<fsa.length){
            sortArray[k] = fsa[i];
            i++;
            k++;
        }
        while(j<ssa.length){
            sortArray[k] = ssa[j];
            j++;
            k++;
        }
        return sortArray;
    }

    public static void main(String[] args) {
        int arr [] ={7,4,1,3,6,8,2,5};
        int [] sortedArrays =mergeSort(arr,0,arr.length-1);

        System.out.println(Arrays.toString(sortedArrays));

        System.out.println(sortedArrays[sortedArrays.length-2]);

    }


}
