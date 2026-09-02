// leetcode 1721
// approach 1
public int Findlen(ListNode head)
{
    int len =0;
    ListNode temp =head;
    while (temp!=null)
    {
        len++;
        temp =temp.next;
    }
    return len;
}
public void swap(ListNode a, ListNode b) {
    int temp = a.val;
    a.val = b.val;
    b.val = temp;
}
public ListNode swapNode(ListNode head, int k) {
    int length =Findlen(head);
    int k1 =k;
    ListNode temp1 =head;
    while (k1 > 1) {
        temp1 = temp1.next;
        k1--;
    }
    int k2 =length-k+1;
    ListNode temp2 =head;
    while (k2>1)
    {
        temp2 =temp2.next;
        k2--;
    }
    swap(temp1,temp2);
    return head;
}

// approach 2
 public void swap(ListNode a, ListNode b) {
            int temp = a.val;
            a.val = b.val;
            b.val = temp;
        }
public ListNode swapNodes(ListNode head, int k) {
    ListNode temp =head;
    ListNode temp1 =null;
    ListNode temp2 =null;
    while (temp!=null)
    {
        k--;
        if (temp2!=null)temp2 =temp2.next;
        if (k==0)
        {
            temp1 =temp;
            temp2 =head;
        }
        temp =temp.next;
    }
    swap(temp1, temp2);
    return head;
}
