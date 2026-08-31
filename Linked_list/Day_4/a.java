package Linked_list.Day_4;

// leetcode 382

import java.util.ArrayList;
import java.util.Random;

class ListNode {
    int val;
    ListNode next;
    ListNode(int d) {
        this.val = d;
        this.next = null;
    }
    ArrayList<Integer>arrayList =new ArrayList<>();
    public Solution(ListNode head) {
        ListNode temp =head;
        while (temp!=null)
        {
            arrayList.add(temp.val);
            temp =temp.next;
        }
    }
    public int getRandom() {
        int n =arrayList.size();
        Random random =new Random();
        int index = random.nextInt(n);
        return arrayList.get(index);
    }
}


