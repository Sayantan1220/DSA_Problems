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
    
}
