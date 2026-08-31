package Linked_list.Day_3;

import java.util.HashMap;
import java.util.HashSet;

// leetcode 142
public class f {
    // approach 1
    public ListNode detectCycle(ListNode head) {
        ListNode fast =head;
        ListNode slow =head;
        ListNode match =head;
        if (head==null || head.next ==null)return null;
        while (fast != null && fast.next!=null)
        {
            fast =fast.next.next;
            slow =slow.next;
            if (fast==slow)break;
        }
        if (fast!=slow)return null;
        while (slow!=match)
        {
            slow =slow.next;
            match =match.next;
        }
        return match;
    }

    // approach 2(brute force)
    public ListNode detectCycli(ListNode head) {
        ListNode match =head;
        HashSet<ListNode> set = new HashSet<>();
        while (match.next!=null)
        {
            if (set.contains(match))return match;
            else
            {
                set.add(match);
                match =match.next;
            }
        }
        return null;
    }
}
