package JavaQuestions.addTwoNumbers;

import java.util.List;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;

        while (l1 != null || l2 !=null || carry != 0){
            int sum = carry + (l1 != null ? l1.val:0)+ (l2 !=null ? l2.val : 0);
            carry = sum/10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            l1 = l1 !=null ? l1.next: null;
            l2 = l2 != null ? l2.next: null;
        }
        return dummy.next;
    }
}