/*Given head, the head of a linked list, determine if the linked list has a cycle in it.
There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
Return true if there is a cycle in the linked list. Otherwise, return false.
https://leetcode.com/problems/linked-list-cycle/
*/

package Solution.LinkedList;

public class LinkedListCycle {

    int val;
    LinkedListCycle next;
    LinkedListCycle(int x) {
        val = x;
        next = null;
        }

    public static boolean hasCycle(LinkedListCycle head) {
        if(head==null) return false;
        LinkedListCycle walker = head;
        LinkedListCycle runner = head;
        while(runner.next!=null && runner.next.next!=null) {
            walker = walker.next;
            runner = runner.next.next;
            if(walker==runner) {
                return true;
            }            
        }
        return false;
    }

    public static void main(String args[]) {
        LinkedListCycle head = new LinkedListCycle(3);
        head.next = new LinkedListCycle(2);
        head.next.next = new LinkedListCycle(1);
        head.next.next.next = new LinkedListCycle(-4);

        boolean res = hasCycle(head);
        System.out.println(res);
    }  
}
