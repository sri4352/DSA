package Stack.Day_2;

import java.util.LinkedList;
import java.util.Queue;

// stack using queue(GFG practice)
class myStack {
    Queue<Integer> q = new LinkedList<>();

    void push(int x) {
       q.add(x);
       int n =q.size();
       for (int i =1;i<n;i++)
       {
           int ele =q.remove();
           q.add(ele);
       }
    }
    void pop() {
      if (!q.isEmpty())q.remove();
    }
    int top() {
       if (q.isEmpty())return -1;
       return q.peek();
    }

    int size() {
       return q.size();
    }
}

public class a {
    public static void main(String[] args) {

    }

}
