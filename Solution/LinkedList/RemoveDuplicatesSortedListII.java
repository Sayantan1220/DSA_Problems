/*Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list. Return the linked list sorted as well.
https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
*/

package Solution.LinkedList;

class RemoveDuplicatesSortedListII {

    int val;
    RemoveDuplicatesSortedListII next;
    RemoveDuplicatesSortedListII() {};
    RemoveDuplicatesSortedListII(int val) { this.val = val; }
    RemoveDuplicatesSortedListII(int val, RemoveDuplicatesSortedListII next) { this.val = val; this.next = next; }

    public static RemoveDuplicatesSortedListII deleteDuplicates(RemoveDuplicatesSortedListII head) {
        //use two pointers, slow - track the node before the dup nodes, 
        // fast - to find the last node of dups.
        RemoveDuplicatesSortedListII dummy = new RemoveDuplicatesSortedListII(0), fast = head, slow = dummy;
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
        RemoveDuplicatesSortedListII head = new RemoveDuplicatesSortedListII(1);
        head.next = new RemoveDuplicatesSortedListII(1);
        head.next.next = new RemoveDuplicatesSortedListII(1);
        head.next.next.next = new RemoveDuplicatesSortedListII(2);
        head.next.next.next.next = new RemoveDuplicatesSortedListII(3);

        RemoveDuplicatesSortedListII res = deleteDuplicates(head);
        while(res != null) {
            System.out.print(res.val + " ");
            res = res.next;
          }
          System.out.println();
    }    
}
