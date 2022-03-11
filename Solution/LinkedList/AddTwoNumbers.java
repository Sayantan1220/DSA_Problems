/*You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.
https://leetcode.com/problems/add-two-numbers/
*/

package Solution.LinkedList;

public class AddTwoNumbers {

    int val;
    AddTwoNumbers next;
    AddTwoNumbers() {}
    AddTwoNumbers(int val) { this.val = val; }
    AddTwoNumbers(int val, AddTwoNumbers next) { this.val = val; this.next = next; }

    public static AddTwoNumbers addTwoNumbers(AddTwoNumbers l1, AddTwoNumbers l2) {
        AddTwoNumbers dummy = new AddTwoNumbers(0); // creating an dummy list
        AddTwoNumbers curr = dummy; // intialising an pointer
        int carry = 0; // intialising our carry with 0 intiall
        // while loop will run, until l1 OR l2 not reaches null OR if they both reaches null. But our carry has some value in it. 
		// We will add that as well into our list
        while(l1 != null || l2 != null || carry == 1){
            int sum = 0; // intialising our sum
            if(l1 != null){ // adding l1 to our sum & moving l1
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){ // adding l2 to our sum & moving l2
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry; // if we have carry then add it into our sum
            carry = sum/10; // if we get carry, then divide it by 10 to get the carry
            AddTwoNumbers node = new AddTwoNumbers(sum % 10); // the value we'll get by moduloing it, will become as new node so. add it to our list
            curr.next = node; // curr will point to that new node if we get
            curr = curr.next; // update the current every time
        }
        return dummy.next; // return dummy.next bcz, we don't want the value we have consider in it intially!!
    }

    public static void main(String args[]) {
        AddTwoNumbers l1 = new AddTwoNumbers(2);
        l1.next = new AddTwoNumbers(4);
        l1.next.next = new AddTwoNumbers(3);
        AddTwoNumbers l2 = new AddTwoNumbers(5);
        l2.next = new AddTwoNumbers(6);
        l2.next.next = new AddTwoNumbers(4);

        AddTwoNumbers res = addTwoNumbers(l1, l2);
        while(res != null) {
            System.out.print(res.val + " ");
            res = res.next;
          }
          System.out.println();
    }
}
