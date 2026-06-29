package String.Day_8;
// palindromic number (leetcode 9)
public class e {
    public boolean isPalindrome(int x) {
        if (x<0)return false;
        if (x==0)return true;
        int no =x;
        int ans =0;
        while (x>0)
        {
            int remainder =x%10;
            if (ans>Integer.MAX_VALUE/10 ||(ans==Integer.MAX_VALUE/10 && remainder>7))
            {
                return false;
            }
            ans =ans*10+remainder;
            x =x/10;
        }
        return ans==no;
    }
    public static void main(String[] args) {

    }

}

