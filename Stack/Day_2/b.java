package Stack.Day_2;

import java.util.Stack;

// queue using stack(GFG practice)
class myQueue {
    Stack<Integer>s1 =new Stack<>();
    Stack<Integer>s2 =new Stack<>();

    void enqueue(int x) {
       s1.push(x);
    }
    void dequeue() {
        if (s1.isEmpty() && s2.isEmpty()) return;
        if (s2.isEmpty())
        {
            while (!s1.isEmpty())
            {
                s2.push(s1.pop());
            }
        }
        s2.pop();
    }
    int front() {
       if (!s2.isEmpty())return s2.peek();
       if (!s1.isEmpty())
       {
           while (!s1.isEmpty())
           {
               s2.push(s1.pop());
           }
           return s2.peek();
       }
       return -1;
    }

    int size() {
       return s1.size()+ s2.size();
    }
}

public class b {
    public static void main(String[] args) {

    }

}
