/*Given an array of elements of length N, ranging from 0 to N-1, 
your task is to write a program that rearranges the elements of the array.
All elements may not be present in the array, if the element is not present then there will be -1 present in the array. 
Rearrange the array such that A[i] = i and if i is not present, display -1 at that place.
https://practice.geeksforgeeks.org/problems/reorganize-the-array4810/1/#
*/

package Solution.Array;

public class ReorganizeArray {
    public static int[] Rearrange (int arr[], int n) {
        // Complete the function
        
        for (int i=0; i<arr.length;){
            if (arr[i]>=0 && arr[i]!=i){
                int temp = arr[arr[i]];
                arr[arr[i]] = arr[i];
                arr[i] = temp;
            }
            else{
                i++;
            }
        }
        return arr;
    }

    public static void main (String[] args) {
        int arr[] = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        int n = 10;
        int[] res = Rearrange(arr, n);
        for (int i=0; i<res.length; i++){
            System.out.print(res[i] + ", ");
        }
    }  
}
