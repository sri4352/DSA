package Linked_list.Day_1;
// search in a linked list(GFG practice)
public class c {
    public boolean searchKey(Node head, int key) {
       Node temp =head;
       while (temp!=null)
       {
           if (temp.data==key)return true;
           temp =temp.next;
       }
       return false;
    }
    public static void main(String[] args) {

    }

}
