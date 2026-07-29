package Stack.Day_1;

import java.util.Stack;

//Parenthesis Checker(GFG practice)
public class a {
    public boolean isBalanced(String s) {
       Stack<Character>st =new Stack<>();
       char [] arr =s.toCharArray();
       for (int i =0;i<arr.length;i++)
       {
           if (arr[i]=='(' || arr[i]=='{' || arr[i]=='[')st.push(arr[i]);
           else
           {
               if (st.isEmpty())return false;
               char ch =st.peek();
               if (arr[i] == ')' && ch != '(') {
                   return false;
               }

               if (arr[i] == '}' && ch != '{') {
                   return false;
               }

               if (arr[i] == ']' && ch != '[') {
                   return false;
               }
               else st.pop();
           }
       }
       return st.isEmpty();
    }
    public static void main(String[] args) {

    }

}
