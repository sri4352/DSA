package Linked_list.Day_3;

// delete at position(GFG practice)

class Node
{
    int data;
    Node next;

    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
  Node deleteNode(Node head, int x) {
        if (x==1)
        {
            head =head.next;
            return head;
        }
        int count =1;
        Node temp =head;
        Node prev =null;
        while (temp.next!=null && count<x)
        {
            prev =temp;
            temp =temp.next;
            count++;
        }
        prev.next =temp.next;
       return head;
    }
}


public class a {

}
