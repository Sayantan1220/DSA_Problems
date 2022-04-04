package Solution.LinkedList;

public class SwappingNodesLinkedList {

    int val;
    SwappingNodesLinkedList next;
    SwappingNodesLinkedList() {}
    SwappingNodesLinkedList(int val) { this.val = val; }
    SwappingNodesLinkedList(int val, SwappingNodesLinkedList next) { this.val = val; this.next = next; }

    public SwappingNodesLinkedList swapNodes(SwappingNodesLinkedList head, int k) {
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
    
}
