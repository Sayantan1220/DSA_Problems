package Solution.Array;

import java.util.Arrays;

public class ShuffleArray {
    public static int[] shuffle(int[] nums, int n) {
        int[] shuffleArray = new int[nums.length];

        for (int i = 0; i < n ; i++){
            shuffleArray[2*i] = nums[i];
            shuffleArray[2*i + 1] = nums[i + n];
        }
        return shuffleArray;
    }

    public static void main(String[] args) {
        int[] arr = { 2,5,1,3,4,7 };
        int n = 3;
        int[] result = shuffle(arr, n);
        System.out.println(Arrays.toString(result));
    }
}
