package Searching_Sorting.Day_1;
// sqrt (leetcode 69 and gfg practice)
public class f {
    public int mySqrt(int x) {
        if (x==1)return 1;
        if(x==0)return 0;
        long i =1;
        long j =x/2;
        long ans =1;
        while (i<=j)
        {
            long mid =i+(j-i)/2;
            if (mid*mid==x)return (int)mid;
            else if (mid*mid<x) {
                ans =mid;
                i =mid+1;
            }
            else j =mid-1;
        }
        return (int)ans;
    }
    public static void main(String[] args) {

    }

}
