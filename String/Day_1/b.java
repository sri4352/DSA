package String.Day_1;
// valid palindrome  (leetcode 125 and  GFG practice)
public class b {
    // leetcode solution
    public boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(s.charAt(left)) !=
                    Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
    // GFG solution
    boolean isPalindromee(String s) {
        int i =0;
        int j =s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))return false;
            else
            {
                i++;
                j--;
            }
        }
        return true;

    }
    public static void main(String[] args) {

    }

}
