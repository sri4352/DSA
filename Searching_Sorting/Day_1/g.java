package Searching_Sorting.Day_1;
// perfect valid square(leetcode 367 and GFG practice)
public class g {
    public boolean isPerfectSquare(int x) {
        if (x==1)return true;
        int i =1;
        int j =x/2;
        while (i<=j)
        {
            long mid =i+(j-i)/2;
            if (mid*mid==x)return true;
            else if (mid*mid<x) {
                i =(int)mid+1;
            }
            else j =(int)mid-1;
        }
        return false;
    }
    public static void main(String[] args) {

    }

}
