package Stack.Day_1;

import java.util.Stack;

//remove all adjacent duplicates in a string(leetcode 1047)
public class e {
    public String removeDuplicates(String s) {
        Stack<Character> stack =new Stack<>();
        int n =s.length();
        for (int i =0;i<n;i++)
        {
            if (stack.isEmpty() || stack.peek()!=s.charAt(i)) stack.push(s.charAt(i));
            else {
                stack.pop();
            }
        }
        StringBuilder ans = new StringBuilder();
        while (!stack.isEmpty())
        {
            ans.append(stack.pop());
        }
        ans.reverse();
        return ans.toString();
    }
    public static void main(String[] args) {

    }

}


