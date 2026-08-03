package Linked_list.Day_1;
import java.util.ArrayList;
// print list (GFG practice)
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data =data;
        this.next =null;
    }
    Node()
    {
        this.data =0;
        this.next =null;
    }
}
public class b {
    public ArrayList<Integer> printList(Node head) {
        ArrayList<Integer> ans =new ArrayList<>();
        Node temp =head;
        while (temp!=null)
        {
            ans.add(temp.data);
            temp =temp.next;
        }
        return ans;
    }
    public static void main(String[] args) {

    }

}
