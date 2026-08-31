package Linked_list.Day_3;

// leetcode 328

public class e {
    public ListNode oddEvenList(ListNode head) {
        if (head==null || head.next ==null)return head;
        ListNode odd =head;
        ListNode even =head.next;
        ListNode Link =head.next;
        while (even!=null && even.next!=null)
        {
            odd.next =even.next;
            even.next =even.next.next;
            odd =odd.next;
            even =even.next;
        }
        odd.next =Link;
        return head;
    }
}
