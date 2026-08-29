package Linked_list.Day_3;

// leetcode 237
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
    // clean way
    public void deleteNod(ListNode node) {
        node.val =node.next.val;
        node.next =node.next.next;
    }

    // alternative way
    public void deleteNode(ListNode node) {
        ListNode prev =null;
        if (node==null)return;
        while (node.next!=null)
        {
            node.val =node.next.val;
            prev =node;
            node =node.next;
        }
        prev.next =null;
    }
}
