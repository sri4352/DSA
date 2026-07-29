package Stack.Day_1;

import java.util.ArrayList;
import java.util.Stack;

// stock span problem(GFG practice)
public class c {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        ArrayList<Integer> ans =new ArrayList<>();
        Stack<int[]> stack =new Stack<>();
        for (int i =0;i<arr.length;i++)
        {
            int span =1;
            while (!stack.isEmpty() && stack.peek()[0]<=arr[i])
            {
                span =span+stack.peek()[1];
                stack.pop();
            }
            stack.push(new int[]{arr[i],span});
           ans.add(span);
        }
        return ans;
    }
    public static void main(String[] args) {

    }

}
