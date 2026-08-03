package Linked_list.Day_1;
// insert at head(GFG practice)
public class d {
    public Node insertAtFront(Node head, int x) {
        Node newNode =new Node(x);
        newNode.next =head;
        head =newNode;
        return newNode;
    }
    public static void main(String[] args) {

    }

}
