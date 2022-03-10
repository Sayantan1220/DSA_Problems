/*Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list. Return the linked list sorted as well.
https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
*/

package Solution.LinkedList;

 class Solution {

    int val;
    Solution next;
    Solution() {};
    Solution(int val) { this.val = val; }
    Solution(int val, Solution next) { this.val = val; this.next = next; }

    public static Solution deleteDuplicates(Solution head) {
        //use two pointers, slow - track the node before the dup nodes, 
        // fast - to find the last node of dups.
        Solution dummy = new Solution(0), fast = head, slow = dummy;
        slow.next = fast;
        while(fast != null) {
            while (fast.next != null && fast.val == fast.next.val) {
                 fast = fast.next;    //while loop to find the last node of the dups.
            }
            if (slow.next != fast) { //duplicates detected.
                slow.next = fast.next; //remove the dups.
                fast = slow.next;     //reposition the fast pointer.
            } else { //no dup, move down both pointer.
                slow = slow.next;
                fast = fast.next;
            }
            
        }
        return dummy.next;
    }

    public static void main(String args[]) {
        Solution head = new Solution(1);
        head.next = new Solution(2);
        head.next = new Solution(0);
        head.next = new Solution(-4);

        Solution res = deleteDuplicates(head);
        while(res != null) {
            System.out.print(res.val + " ");
            res = res.next;
          }
          System.out.println();
    }    
}
