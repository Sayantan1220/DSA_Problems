package Solution.LinkedList;

public class RotateList {

    int val;
    RotateList next;
    RotateList() {}
    RotateList(int val) { this.val = val; }
    RotateList(int val, RotateList next) { this.val = val; this.next = next; }

    public static RotateList rotateRight(RotateList head, int k) {
        if(head==null)
            return null;
        int size = 1; // since we are already at head node
        RotateList fast=head;
        RotateList slow = head;
        
        while(fast.next!=null){
            size++;
            fast = fast.next;
        }
        
        for(int i=size-k%size;i>1;i--) // i>1 because we need to put slow.next at the start.
            slow = slow.next;
        
        // No dummy variable.
        fast.next = head;
        head = slow.next;
        slow.next = null;
        
        return head;
    }

    public static void main(String args[]) {
        RotateList l1 = new RotateList(1);
        l1.next = new RotateList(2);
        l1.next.next = new RotateList(3);
        l1.next.next.next = new RotateList(4);
        l1.next.next.next.next = new RotateList(5);

        RotateList res = rotateRight(l1, 2);
        while(res != null) {
            System.out.print(res.val + " ");
            res = res.next;
          }
          System.out.println();
    } 
}
