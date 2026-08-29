package Linked_list.Day_3;
// leetcode 876 and GFG practice
public class d {
    public ListNode middleNode(ListNode head) {
        ListNode fast =head;
        ListNode slow =head;
        while (fast!=null && fast.next!=null)
        {
            fast =fast.next.next;
            slow =slow.next;
        }
        return slow;
    }
}
