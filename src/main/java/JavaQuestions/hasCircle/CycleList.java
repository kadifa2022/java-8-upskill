package JavaQuestions.hasCircle;

public class CycleList {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next ==null){
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while(slow != fast){
            if(fast == null || fast.next == null){
                return false;// Reached end of the list, no cycle
            }
            slow = slow.next;// Move slow pointer by one step
            fast = fast.next.next;// Move fast pointer by two steps
        }
        return true ;// Fast and slow pointers meet, indicating a cycle
    }
}