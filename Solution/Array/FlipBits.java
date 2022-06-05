package Solution.Array;

public class FlipBits {
    public static int flipBits(int[] arr,int n) {
        //Write your code here
        int count = 0;
        int currSum = 0;
        int maxSum = 0;
        for (int i=0; i<n; i++){
            if (arr[i] == 1){
                count++;
            }
            int value = arr[i] == 1 ? -1 : 1;
            currSum += value;
            if (currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        return count + maxSum;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 0, 1, 0 };
        long result = flipBits(arr, arr.length);
        System.out.println(result);
    }
}
