package Stack.Day_1;

import java.util.Stack;

// removing stars from string(leetcode 2390)
public class f {
    // approach 1
    public String removeStars(String s) {
        Stack<Character>stack =new Stack<>();
        for (int i =0;i<s.length();i++)
        {
            if (s.charAt(i)=='*')stack.pop();
            else stack.push(s.charAt(i));
        }
        StringBuilder ans = new StringBuilder();
        while (!stack.isEmpty())
        {
            ans.append(stack.pop());
        }
        ans.reverse();
        return ans.toString();
    }
    // approach 2
    public String removeStar(String s) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') ans.deleteCharAt(ans.length() - 1);
            else ans.append(s.charAt(i));
        }
        return ans.toString();
    }
    // approach 3(best approach)
    public String removeStarss(String s) {
        StringBuilder ans = new StringBuilder();
        int n =s.length();
        char [] arr =new char[n];
        int j =0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*')j--;
            else
            {
                arr[j] =s.charAt(i);
                j++;
            }
        }
        for (int i =0;i<j;i++)
        {
            ans.append(arr[i]);
        }

        return ans.toString();
    }
    public static void main(String[] args) {

    }

}
