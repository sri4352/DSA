package Recursion.Day_1;
//Nth Fibonacci Number(leetcode 509 and GFG practice)
public class d {
    // using recursion
    public int fib(int n) {
       if (n==0 || n==1)return n;
        else return fib(n-1)+fib(n-2);
    }
    // using dp
    int nthFibonacci(int n) {
        if (n <= 1) return n;
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; ++i) {
                arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }

    public static void main(String[] args) {

    }

}

