package String.Day_6;
// valid palindrome 2 (leetcode 680)
public class b {
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
    public boolean validPalindrome(String s) {
        int i =0;
        int j =s.length()-1;
        while (i<=j)
        {
            if (s.charAt(i)==s.charAt(j))
            {
                i++;
                j--;
            }
            else
            {
               return isPalindrome(s,i+1,j) || isPalindrome(s,i,j-1);
            }
        }
        return true;
    }
    public static void main(String[] args) {

    }

}

