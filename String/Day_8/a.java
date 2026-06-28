package String.Day_8;
// longest palindromic substring(leetcode 5)
public class a {
    public boolean isPalindrome(String s,int left,int right) {
        while (left <=right) {
            if (s.charAt(left)!=s.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        String ans ="";
        for (int i =0;i<s.length();i++)
        {
            for (int j =i;j<s.length();j++)
            {
                if (isPalindrome(s,i,j))
                {
                    if (s.substring(i,j+1).length()>ans.length())
                    {
                        ans =s.substring(i,j+1);
                    }
                }
            }
        }
        return ans;

    }
    public static void main(String[] args) {

    }
}
