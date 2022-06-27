/*Given the head of a singly linked list, reverse the list, and return the reversed list.
https://leetcode.com/problems/reverse-linked-list/
*/

package Solution.LinkedList;

public class ReverseLinkedList {

    int val;
    ReverseLinkedList next;
    ReverseLinkedList() {}
    ReverseLinkedList(int val) { this.val = val; }
    ReverseLinkedList(int val, ReverseLinkedList next) { this.val = val; this.next = next; }

    public static ReverseLinkedList reverseList(ReverseLinkedList head) {
        ReverseLinkedList prev = null;
        ReverseLinkedList t;
        while(head != null) {
            t = head.next;
            head.next = prev;
            prev = head;
            head = t;
        }
        return prev;
    }

    public static void main(String args[]) {
        ReverseLinkedList l1 = new ReverseLinkedList(1);
        l1.next = new ReverseLinkedList(2);
        l1.next.next = new ReverseLinkedList(3);
        l1.next.next.next = new ReverseLinkedList(4);
        l1.next.next.next.next = new ReverseLinkedList(5);

        ReverseLinkedList res = reverseList(l1);
        while(res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
        System.out.println();
    }
}
