package Stack.Day_2;

import java.util.LinkedList;
import java.util.Queue;

// stack using queue(leetcode 225)
class MyStack {

    public MyStack() {

    }
    Queue<Integer> q = new LinkedList<>();
    public void push(int x) {
        q.add(x);
        int n =q.size();
        for (int i =1;i<n;i++)
        {
            int ele =q.remove();
            q.add(ele);
        }
    }

    public int pop() {
        if (!q.isEmpty())
        {
            return q.remove();
        }
        return -1;
    }

    public int top() {
        if (q.isEmpty())return -1;
        return q.peek();
    }
    public boolean empty() {
        return q.size()==0;
    }
}


public class d {
    public static void main(String[] args) {

    }

}
