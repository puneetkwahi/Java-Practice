package geeksforgeeks;

public class FindPairForSum {
    /*
    Input: arr[] = {11, 15, 6, 8, 9, 10}, x = 16
    Output: true
    There is a pair (6, 10) with sum 16

    Input: arr[] = {11, 15, 26, 38, 9, 10}, x = 35
    Output: true
    There is a pair (26, 9) with sum 35

    Input: arr[] = {11, 15, 26, 38, 9, 10}, x = 45
    Output: false
    There is no pair with sum 45.
     */

    static boolean checkPair(int[] arr) {
        int sum = 16;
        for (int i = 0; i < arr.length; i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i] + arr[j] == sum) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {11, 15, 6, 8, 9, 10};
        System.out.println(checkPair(arr));

    }
}
