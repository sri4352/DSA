package String.Day_8;
// reverse integer (leetcode 7)
public class d {
    public int reverse(int x)
    {
        int sign =1;
        if (x<0)
        {
            sign =-1;
            x =-1*x;
        }
        int ans =0;
        while (x>0)
        {
            int remainder =x%10;
            if (ans>Integer.MAX_VALUE/10 ||(ans==Integer.MAX_VALUE/10 && remainder>7))
            {
                return 0;
            }
            ans =ans*10+remainder;
           x =x/10;
        }
        return ans*sign;
    }
    public static void main(String[] args) {

    }

}

