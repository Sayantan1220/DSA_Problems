package Solution.LinkedList;

public class RemoveNthNodeEndList {

    int val;
    RemoveNthNodeEndList next;
    RemoveNthNodeEndList() {}
    RemoveNthNodeEndList(int val) { this.val = val; }
    RemoveNthNodeEndList(int val, RemoveNthNodeEndList next) { this.val = val; this.next = next; }

    public static RemoveNthNodeEndList removeNthFromEnd(RemoveNthNodeEndList head, int n) {
        RemoveNthNodeEndList start = new RemoveNthNodeEndList(0);
        start.next = head;
        RemoveNthNodeEndList slow = start;
        RemoveNthNodeEndList fast = start;

        for(int i = 1; i <= n; i++){
            fast = fast.next;
        }
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return start.next;
    }

    public static void main(String[] args) {
        RemoveNthNodeEndList l1 = new RemoveNthNodeEndList(1);
        l1.next = new RemoveNthNodeEndList(2);
        l1.next.next = new RemoveNthNodeEndList(3);
        l1.next.next.next = new RemoveNthNodeEndList(4);
        l1.next.next.next.next = new RemoveNthNodeEndList(5);
        int n = 2;

        RemoveNthNodeEndList res = removeNthFromEnd(l1, n);
        while(res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
        System.out.println();
    }
}
