package Recursion.Day_1;
// factorial of a number(GFG practice)
public class a {
    static int factorial(int n)
    {
        if (n==1 || n==0)return 1;
        else return n*factorial(n-1);
    }
    public static void main(String[] args) {

    }

}
