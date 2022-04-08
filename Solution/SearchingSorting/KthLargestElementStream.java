/*Design a class to find the kth largest element in a stream. 
Note that it is the kth largest element in the sorted order, not the kth distinct element.
Implement KthLargest class:
KthLargest(int k, int[] nums) Initializes the object with the integer k and the stream of integers nums.
int add(int val) Appends the integer val to the stream and returns the element representing the kth largest element in the stream.
https://leetcode.com/problems/kth-largest-element-in-a-stream/
*/

package Solution.SearchingSorting;
import java.util.*;

public class KthLargestElementStream {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    int k;    
    public void KthLargest(int k, int[] nums) {
        this.k = k;
        for (Integer i : nums) {
            minHeap.add(i);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
    }
    
    public int add(int val) {
        minHeap.add(val);
        if (minHeap.size() > k) {
            minHeap.poll();
        }        
        return minHeap.peek();
    }

    public static void main(String args[]) {
        int nums[] = {4, 5, 8, 2};
        int k = 3;
        KthLargestElementStream kthLargest = new KthLargestElementStream();
        kthLargest.KthLargest(k, nums);
        int res = kthLargest.add(3);
        System.out.println(res);
    } 
}
