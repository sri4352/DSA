package Stack.Day_2;

import java.util.Stack;

// queue using stack(leetcode 232)
class MyQueue {

    public MyQueue() {

    }
    Stack<Integer> s1 =new Stack<>();
    Stack<Integer>s2 =new Stack<>();
    public void push(int x) {
        s1.push(x);
    }

    public int pop() {
        if (s1.isEmpty() && s2.isEmpty()) return s2.pop();
        if (s2.isEmpty())
        {
            while (!s1.isEmpty())
            {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }
    public int peek() {
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

    public boolean empty() {
        return s1.size()+s2.size()==0;
    }
}

public class c {
    public static void main(String[] args) {

    }

}
