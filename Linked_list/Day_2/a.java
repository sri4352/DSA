package Linked_list.Day_2;
// LinkedList Traversal(GFG practice)
public class a {
    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }
    void printList(Node head) {
        Node temp =head;
        while (temp!=null)
        {
            System.out.println(temp.data);
            temp =temp.next;
        }
    }
    public static void main(String[] args) {

    }

}
