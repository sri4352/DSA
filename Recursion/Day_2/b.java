package Recursion.Day_2;
// climbing stairs(leetcode 70 and GFG practice)
public class b {
    public int climbStair(int n) {
        if (n==0 || n==1)return 1;
       return climbStairs(n-1)+climbStairs(n-2);
    }
    //2nd approach
    public int climbStairs(int n) {
        int[] arr = new int[n + 1];
        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i <= n; i++)
            arr[i] = arr[i - 1] + arr[i - 2];

        return arr[n];
    }

    public static void main(String[] args) {

    }

}

