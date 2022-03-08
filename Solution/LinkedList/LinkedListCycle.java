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
            if(walker==runner) return true;
        }
        return false;
    }

    public static void main(String args[]) {
        LinkedListCycle head = new LinkedListCycle(1);
        head.next = new LinkedListCycle(2);
        head.next = new LinkedListCycle(0);
        head.next = new LinkedListCycle(-4);

        boolean res = hasCycle(head);
        System.out.println(res);
    }  
}
