/*Given an unsorted array arr[] of size N. 
Rotate the array to the left (counter-clockwise direction) by D steps, where D is a positive integer. 
https://practice.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/1/#
*/

package Solution.Array;

public class RotateArray {
    static int[] rotateArr(int arr[], int d, int n)
    {
        // add your code here
        if(d==0){
            return null;
        }
        d = d%n;
        
        reverseArr(arr, 0, d-1);
        reverseArr(arr, d, n-1);
        reverseArr(arr, 0, n-1);

        return arr;
    }
    
    static int[] reverseArr(int arr[], int start, int end){
        int temp;
        while(start<end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

    public static void main (String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int d = 2;
        int n = 6;
        int[] res = rotateArr(arr, d, n);
        for (int i=0; i<res.length; i++){
            System.out.print(res[i]);
        }
    }  
}
