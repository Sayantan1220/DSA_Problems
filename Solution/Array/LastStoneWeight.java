package Solution.Array;

public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        int[] buckets = new int[1001];
        for (int i = 0; i < stones.length; i++) {
            buckets[stones[i]]++;
        }

        int slow = buckets.length - 1;   //start from the big to small
        while (slow > 0) {
		// If the number of stones with the same size is even or zero, 
		// these stones can be totally destroyed pair by pair or there is no such size stone existing, 
		// we can just ignore this situation.
		
        // When the number of stones with the same size is odd, 
		// there should leave one stone which is to smash with the smaller size one.
            if (buckets[slow]%2 != 0) {
                int fast = slow - 1;
                while (fast > 0 && buckets[fast] == 0) {
                    fast--;
                }
                if (fast == 0) break;
                buckets[fast]--;
                buckets[slow - fast]++;
            }
            slow--;
        }
        return slow;
    }
    
}
