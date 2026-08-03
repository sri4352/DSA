package Linked_list.Day_1;
// change array to list(GFG practice)
public class a {
    public Node arrayToList(int arr[]) {
        Node head =new Node(arr[0]);
        Node element =head;
        for (int i=1;i<arr.length;i++)
        {
            Node n =new Node(arr[i]);
            element.next =n;
            element =n;
        }
        return head;
    }
    public static void main(String[] args) {

    }

}
