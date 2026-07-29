package Stack.Day_1;

import java.util.Stack;
//daily temperatures(leetcode 739)
public class d {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int []> stack =new Stack<>();
        int n = temperatures.length;
        int [] ans =new int[n];
        for (int i =0;i< n;i++)
        {
            int temp =temperatures[i];
            while (!stack.isEmpty() && stack.peek()[0]<temp)
            {
                int[] arr =stack.pop();
                ans[arr[1]] =i-arr[1];
            }
            stack.push(new int[]{temp,i});
        }
        return ans;
    }
    public static void main(String[] args) {

    }

}
