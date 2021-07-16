/*Maximum and minimum of an array using minimum number of comparisons
If n is odd then initialize min and max as first element. 
If n is even then initialize min and max as minimum and maximum of the first two elements respectively. 
For rest of the elements, pick them in pairs and compare their 
maximum and minimum with max and min respectively.*/

public class MaxMinArray {

    public static void maxMin(int arr[], int n) {
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        boolean odd = false;
        if (n % 2 == 1) {
            odd = true;
        }
        if (odd) {
            n--;
        }

        for (int i = 0; i < n; i = i + 2) {
            int max, min;
            if (arr[i] > arr[i + 1]) {
                max = arr[i];
                min = arr[i + 1];
            } else {
                max = arr[i + 1];
                min = arr[i];
            }

            if (max > maximum) {
                maximum = max;
            }

            if (min < minimum) {
                minimum = min;
            }
        }

        if (odd) {
            if (arr[n] > maximum) {
                maximum = arr[n];
            }

            if (arr[n] < minimum) {
                minimum = arr[n];
            }
        }

        System.out.println("max->" + maximum);
        System.out.println("min->" + minimum);
    }

    public static void main(String args[]) {
        int arr[] = { 10, 73, 64, -107, 210 };
        maxMin(arr, arr.length);
    }

}
