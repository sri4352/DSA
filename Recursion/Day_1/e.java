package Recursion.Day_1;
// power of 2 (leetcode 231)
public class e {
    // first approach using math
    public boolean isPowerOfTwo(int n) {
        if (n <= 0)
            return false;
        int logValue = (int)(Math.log(n) / Math.log(2));
        return Math.pow(2, logValue) == n;
    }
    // using while looop
    public boolean isPowerOffTwo(int n) {
        if (n<=0)return false;
       while (n>1)
       {
           if (n%2!=0)return false;
           n =n/2;
       }
       return true;
    }
    public boolean check(int n)
    {
        if (n<=0)return false;
        if (n==1)return true;
        if (n%2!=0)return false;
        return check(n/2);
    }
    public boolean isPowerOfTwoo(int n) {

        return check(n);
    }
    public static void main(String[] args) {

    }

}
