package Linked_list.Day_1;
// insert at end(gfg practice)
public class f {
    public Node insertAtEnd(Node head, int val) {
        Node node =new Node(val);
        if (head==null){
            head =node;
            return node;
        }
        Node temp =head;
        while (temp.next!=null)
        {
            temp =temp.next;
        }
        temp.next =node;
        return head;
    }
    public static void main(String[] args) {

    }

}
