package Solution.SearchingSorting;

public class ReversePairs {
    public static int reversePairs(int[] nums) {
        int n = nums.length; // n is the length of the array
        return mergeSort(nums,0,n-1); // calling the merge sort function to sort the array
    }

    private static int mergeSort(int[] nums, int strtIdx, int endIdx){

        if (strtIdx>=endIdx){//if zero elements in the array or one element in the array
            return 0;
        }
        int count = 0; //count is the number of pairs of elements in the array
        int mid = strtIdx + (endIdx - strtIdx)/2; //mid is the mid-point of the array


        //start index to mid index means left subarray and mid+1 to end index means right subarray

        count +=mergeSort(nums,strtIdx,mid); //count pairs and recursively call the merge sort function to sort the left subarray
        count +=mergeSort(nums,mid+1,endIdx);//count pairs and recursively call the merge sort function to sort the right subarray
        count +=merge(nums,strtIdx,mid,endIdx);//count pairs and recursively call the merge function to sort the left subarray and right subarray
        return count;//return the number of pairs of elements in the array
    }

    private static int merge(int[] nums, int strtIdx, int mid, int endIdx){ //we need mid for the left subarray and endIdx for the right subarray
        int count = 0;//count is the number of pairs of elements in the array

        //size of the array is endIdx-strtIdx+1 means the size of the left subarray and right subarray
        int[]a = new int[endIdx-strtIdx+1];//a is the array to store the elements of the left subarray and right subarray respectively
        int index = 0;//index is the index of the array


        //i is the start index of the left subarray and j is the start index of the right subarray
        int i = strtIdx,j = mid+1;


        //while the start index of the left subarray is less than or equal to the end index of the left subarray
        // and the start index of the right subarray is less than or equal to the end index of the right subarray
        while(i<=mid && j<= endIdx){


            //if the element of the left subarray is greater than 2 times the element of the right subarray then increment the count
            // by 1 and increment the j index by 1 to move to the next element of the right subarray
            if((long) nums[i] > 2*(long) nums[j]){//if the element of the left subarray is greater than 2 times the element of the right subarray
                count+= mid - i+1; //we do this because we need to count the number of pairs of elements in the left subarray also considering the mid index
                j++;//increment the j index by 1 to move to the next element of the right subarray
            }
            else
            {
                i++;//increment the i index by 1 to move to the next element of the left subarray
            }
        }
        //while the start index of the left subarray is less than or equal to the end index of the left subarray
        i = strtIdx;
        j = mid +1 ;
        while (i<= mid && j <= endIdx) {
            if(nums[i]>nums[j]){
                a[index++] = nums[j++];
            }
            else {
                a[index++] = nums[i++];
            }


        }
        while (i <= mid ){
            a[index++]=nums[i++];
        }
        while (j <= endIdx){
            a[index++] = nums[j++];
        }
        System.arraycopy(a,0,nums,strtIdx,endIdx-strtIdx+1);
        return count ;
    }

    public static void main(String args[]) {
        int nums[] = {2,4,3,5,1};
        int res = reversePairs(nums);
        System.out.println(res);
    }
}
