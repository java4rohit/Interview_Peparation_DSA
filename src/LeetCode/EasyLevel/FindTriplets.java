package LeetCode.EasyLevel;

class FindTriplets {
    // Prints all triplets in arr[] with 0 sum
    static void findTriplets(int[] arr, int n)
    {
        boolean found = false;
        for (int i = 0; i < n ; i++) {

            for (int j = i + 1; j < n ; j++) {

                for (int k = j + 1; k < n; k++) {
                         if(arr[i]+arr[j]+arr[k]==0) {
                             System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                             found = true;
                         }

                }
            }
        }
 
        // If no triplet with 0 sum found in array
        if (found == false)
            System.out.println(" not exist ");
    }
 
    // SnakeAndLadderDriver code
    public static void main(String[] args)
    {
        int arr[] = { 0, -1, 2, -3, 1 ,9};
        int n = arr.length;
        findTriplets(arr, n);
    }
}
