package Recursion.Day_3;

import java.util.Stack;
// reverse a stack (GFG practice)
public class a {
    // 1 approach
    public static void reverseStack(Stack<Integer> st) {
        if (st.isEmpty())return;
       int top = st.pop();
        reverseStack(st);
        Stack<Integer> temp =new Stack<>();
        while (!st.isEmpty())
        {
            temp.push(st.pop());
        }
        st.push(top);
        while (!temp.isEmpty())
        {
            st.push(temp.pop());
        }
    }
    // 2 approach
    public static void insertAtBottom(Stack<Integer>st,int element)
    {
        if (st.isEmpty())
        {
            st.push(element);
            return;
        }
        int top_element =st.pop();
        insertAtBottom(st,element);
        st.push(top_element);
    }
    public static void reversestack(Stack<Integer> st) {
        if (st.isEmpty())return;
        int top = st.pop();
        reversestack(st);
        insertAtBottom(st,top);
    }
}
