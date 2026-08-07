package Linked_list.Day_2;
class LinkedList {

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    Node head;
    Node tail;
    LinkedList() {
        head = null;
        tail = null;
    }
    
    LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
    }

    public void insertAtHead(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void insertAtTail(int value) {
        Node newNode = new Node(value);

        if (tail == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }
}
public class optimized {
    public static void main(String[] args) {

    }

}

