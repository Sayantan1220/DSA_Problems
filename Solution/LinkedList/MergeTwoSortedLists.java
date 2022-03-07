/*You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
Return the head of the merged linked list.
https://leetcode.com/problems/merge-two-sorted-lists/
*/

package Solution.LinkedList;
 
class Solution {
    int val;
    Solution next;
    Solution() {}
    Solution(int val) { this.val = val; }
    Solution(int val, Solution next) { this.val = val; this.next = next; }
    public static Solution mergeTwoLists(Solution l1, Solution l2){
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		if(l1.val < l2.val){
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		} else{
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}
    }
    
    public static void main(String args[]) {
        Solution l1 = new Solution(1);
        l1.next = new Solution(2);
        l1.next.next = new Solution(4);
        Solution l2 = new Solution(1);
        l1.next = new Solution(3);
        l1.next.next = new Solution(4);

        Solution res = mergeTwoLists(l1, l2);
        while(res != null) {
            System.out.print(res.val + " ");
            res = res.next;
          }
          System.out.println();
    }
}