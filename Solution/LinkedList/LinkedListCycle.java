package Solution.LinkedList;

public class LinkedListCycle {

    int val;
    LinkedListCycle next;
    LinkedListCycle(int x) {
        val = x;
        next = null;
        }

    public boolean hasCycle(LinkedListCycle head) {
        if(head==null) return false;
        LinkedListCycle walker = head;
        LinkedListCycle runner = head;
        while(runner.next!=null && runner.next.next!=null) {
            walker = walker.next;
            runner = runner.next.next;
            if(walker==runner) return true;
        }
        return false;
    }
    
}
