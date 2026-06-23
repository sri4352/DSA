package String.Day_4;
// remove all adjacent duplicates in a string(leetcode 1047)
public class a {
    public String removeDuplicates(String s) {
        int n =s.length();
        StringBuilder ans =new StringBuilder();
        int i =0;
        while (i<n)
        {
            if (ans.length() == 0 || ans.charAt(ans.length() - 1) != s.charAt(i))
            {
                ans.append(s.charAt(i));
            }
            else
            {
                ans.deleteCharAt(ans.length()-1);
            }
            i++;
        }
        return ans.toString();
    }
    public static void main(String[] args) {

    }

}
