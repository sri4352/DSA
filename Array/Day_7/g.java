package Array.Day_7;
// leetcode 3536

public class g {
    public int maxProduct(int n) {
        int max =Integer.MIN_VALUE;
        int no =n;
        int product =1;
        while (n>0)
        {
            if (n%10>=max)
            {
                max =n%10;
            }
            n/=10;
        }
        product*=max;
        int  duplicate_count =1;
        max =Integer.MIN_VALUE;
        while (no>0)
        {
            if (no%10==product && duplicate_count==1)
            {
                duplicate_count =0;
            } else if (no%10>=max) {
                max =no%10;
            }
            no/=10;
        }
        product*=max;
        return product;
    }
    public static void main(String[] args) {

    }

}
