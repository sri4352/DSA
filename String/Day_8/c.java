package String.Day_8;
//Implement Atoi(leetcode 8 and GFG practice)
public class c {
    public int myAtoi(String s) {
        int n =s.length();
        int i =0;
        int ans =0;
        int mark =1;
        while (i<n && s.charAt(i)==' ')
        {
            i++;
        }
        if (i<n &&(s.charAt(i)=='+' || s.charAt(i)=='-'))
        {
            mark =s.charAt(i)=='+'?1:-1;
            i++;
        }
        while (i<n && Character.isDigit(s.charAt(i)))
        {
            if (ans>Integer.MAX_VALUE/10 ||(ans==Integer.MAX_VALUE/10 && s.charAt(i)-'0'>7))
            {
                return mark ==1?Integer.MAX_VALUE :Integer.MIN_VALUE;
            }
            ans =ans*10+(s.charAt(i)-'0');
            i++;
        }
        return ans*mark;
    }

    public static void main(String[] args) {

    }

}
