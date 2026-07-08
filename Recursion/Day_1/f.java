package Recursion.Day_1;
//pow(x,n) leetcode 50 and GFG practice
public class f {
    public double calc(double x ,long power)
    {
        if (power == 0)
            return 1;
        double temp = calc(x, power/ 2);
        if (power % 2 == 0)
            return temp * temp;
        else
            return x * temp * temp;
    }
    public double myPow(double x, int n) {
        long power =Math.abs((long)n);
        double  ans =calc(x,power);
        if (n<0)return 1/ans;
        return ans;
    }
    public static void main(String[] args) {

    }

}
