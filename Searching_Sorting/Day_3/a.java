package Searching_Sorting.Day_3;
// divide two integers without bit manipulation(by binary search)
// leetcode 29 and GFG practice
public class a {
    // leetcode solution
    public int divide(int dividend, int divisor) {
        long divd =(long)dividend;
        long divs =(long)divisor;
        if (dividend==Integer.MIN_VALUE && divisor==-1)
        {
            return Integer.MAX_VALUE;
        }
        long i =0;
        long j =Math.abs(divd);
        long ans =0;
        while (i<=j)
        {
            long mid =i+(j-i)/2;
            if (mid*Math.abs(divs)==Math.abs(divd))
            {
                ans =mid;
                break;
            } else if (mid*Math.abs(divs)<Math.abs(divd)) {
                ans =mid;
                i =mid+1;
            }
            else j =mid-1;
        }
        if ((divd<0 && divs<0) || (divd>0 && divs>0))
        {
            return (int)ans;
        }
        if (divd<0 || divs<0)
        {
            ans =-1*ans;
            return (int)ans;
        }

        return (int)ans;
    }

    // GFG solution
    public static long divide(long dividend, long divisor) {
        long i =0;
        long j =Math.abs(dividend);
        long ans =0;
        while (i<=j)
        {
            long mid =i+(j-i)/2;
            if (mid*Math.abs(divisor)==Math.abs(dividend))
            {
                ans =mid;
                break;
            } else if (mid*Math.abs(divisor)<Math.abs(dividend)) {
                ans =mid;
                i =mid+1;
            }
            else j =mid-1;
        }
        if ((dividend<0 && divisor<0) || (dividend>0 && divisor>0))
        {
            return ans;
        }
        if (dividend<0 || divisor<0)
        {
            ans =-1*ans;
            return ans;
        }

        return ans;
    }

    public static void main(String[] args) {

    }

}

