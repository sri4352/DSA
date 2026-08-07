package Linked_list.Day_2;
//Insert in a Singly Linked List(GFG practice)
public class b {
    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }
    public Node insertPos(Node head, int pos, int val) {
        if (pos == 1) {
            Node newNode = new Node(val);
            newNode.next = head;
            head = newNode;
            return head;
        }
        Node current =head;
        for (int i = 1; i < pos && current!=null; i++)
        {
            current =current.next;
        }
        if (current==null)return head;
        Node newNode =new Node(val);
        newNode.next =current.next;
        current.next =newNode;
        return head;
    }
    public static void main(String[] args) {

    }

}




