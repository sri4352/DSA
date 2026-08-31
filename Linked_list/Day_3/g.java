package Linked_list.Day_3;

// leetcode 141 and GFG practice
public class g {
    public boolean hasCycle(ListNode head) {
        ListNode fast =head;
        ListNode slow =head;
        while (fast != null && fast.next!=null)
        {
            fast =fast.next.next;
            slow =slow.next;
            if (fast==slow)return true;
        }
        return false;
    }
}
