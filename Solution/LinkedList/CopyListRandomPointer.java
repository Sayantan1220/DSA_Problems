/*A linked list of length n is given such that each node contains an additional random pointer, which could point to any node in the list, or null.
Construct a deep copy of the list. The deep copy should consist of exactly n brand new nodes, where each new node has its value set to the value of its corresponding original node. Both the next and random pointer of the new nodes should point to new nodes in the copied list such that the pointers in the original list and copied list represent the same list state. None of the pointers in the new list should point to nodes in the original list.
For example, if there are two nodes X and Y in the original list, where X.random --> Y, then for the corresponding two nodes x and y in the copied list, x.random --> y.
Return the head of the copied linked list.
The linked list is represented in the input/output as a list of n nodes. Each node is represented as a pair of [val, random_index] where:
val: an integer representing Node.val
random_index: the index of the node (range from 0 to n-1) that the random pointer points to, or null if it does not point to any node.
Your code will only be given the head of the original linked list.
https://leetcode.com/problems/copy-list-with-random-pointer/
*/

package Solution.LinkedList;
import java.util.HashMap;
import java.util.Map;

public class CopyListRandomPointer {

    int val;
    CopyListRandomPointer next;
    CopyListRandomPointer random;

    public CopyListRandomPointer(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }

    static Map<CopyListRandomPointer,CopyListRandomPointer> map = new HashMap<>();
    public static CopyListRandomPointer copyRandomList(CopyListRandomPointer head) {
        if(head == null) return null;
        CopyListRandomPointer temp = new CopyListRandomPointer(head.val);
        map.put(head,temp);
        temp.next = copyRandomList(head.next);
        temp.random = map.get(head.random);
        return temp; 
    }   

    public static void main(String args[]) {
        CopyListRandomPointer head = new CopyListRandomPointer(13);
        head.next = new CopyListRandomPointer(0);
        head.next.next = new CopyListRandomPointer(11);
        head.next.next.next = new CopyListRandomPointer(4);

        CopyListRandomPointer res = copyRandomList(head);
        while(res != null) {
            System.out.print(res.val + " ");
            res = res.next;
          }
          System.out.println();
    } 
}

