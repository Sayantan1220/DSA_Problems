/*You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
Return the head of the merged linked list.
https://leetcode.com/problems/merge-two-sorted-lists/
*/

package Solution.LinkedList;
 
class MergeTwoSortedLists {

    int val;
    MergeTwoSortedLists next;
    MergeTwoSortedLists() {}
    MergeTwoSortedLists(int val) { this.val = val; }
    MergeTwoSortedLists(int val, MergeTwoSortedLists next) { this.val = val; this.next = next; }

    public static MergeTwoSortedLists mergeTwoLists(MergeTwoSortedLists l1, MergeTwoSortedLists l2){
		    if(l1 == null) return l2;
		    if(l2 == null) return l1;
		    if(l1.val < l2.val){
			      l1.next = mergeTwoLists(l1.next, l2);
			      return l1;
		    } 
        else{
			      l2.next = mergeTwoLists(l1, l2.next);
			      return l2;
		    }
    }
    
    public static void main(String args[]) {
        MergeTwoSortedLists l1 = new MergeTwoSortedLists(1);
        l1.next = new MergeTwoSortedLists(2);
        l1.next.next = new MergeTwoSortedLists(4);
        MergeTwoSortedLists l2 = new MergeTwoSortedLists(1);
        l2.next = new MergeTwoSortedLists(5);
        l2.next.next = new MergeTwoSortedLists(8);

        MergeTwoSortedLists res = mergeTwoLists(l1, l2);
        while(res != null) {
            System.out.print(res.val + " ");
            res = res.next;
          }
          System.out.println();
    }
}