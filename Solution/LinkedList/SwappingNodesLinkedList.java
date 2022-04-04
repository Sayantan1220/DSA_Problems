/*You are given the head of a linked list, and an integer k.
Return the head of the linked list after swapping the values of the kth node from the beginning and the kth node from the end (the list is 1-indexed).
https://leetcode.com/problems/swapping-nodes-in-a-linked-list/
*/

package Solution.LinkedList;

public class SwappingNodesLinkedList {

    int val;
    SwappingNodesLinkedList next;
    SwappingNodesLinkedList() {}
    SwappingNodesLinkedList(int val) { this.val = val; }
    SwappingNodesLinkedList(int val, SwappingNodesLinkedList next) { this.val = val; this.next = next; }

    public static SwappingNodesLinkedList swapNodes(SwappingNodesLinkedList head, int k) {
        SwappingNodesLinkedList n1 = null, n2 = null;
        for (var p = head; p != null; p = p.next) {
            n2 = n2 == null ? null : n2.next;
            if (--k == 0) {
                n1 = p;
                n2 = head;
            }
        }
        var tmp = n1.val;
        n1.val = n2.val;
        n2.val = tmp;
        return head;
    }

    public static void main(String args[]) {
        SwappingNodesLinkedList l1 = new SwappingNodesLinkedList(1);
        l1.next = new SwappingNodesLinkedList(2);
        l1.next.next = new SwappingNodesLinkedList(3);
        l1.next.next.next = new SwappingNodesLinkedList(4);
        l1.next.next.next.next = new SwappingNodesLinkedList(5);
        int k = 2;

        SwappingNodesLinkedList res = swapNodes(l1, k);
        while(res != null) {
            System.out.print(res.val + " ");
            res = res.next;
          }
          System.out.println();
    }  
}
