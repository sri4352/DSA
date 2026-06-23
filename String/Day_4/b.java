package String.Day_4;
// Replace Consecutive Two Same with One(GFG practice)
public class b {
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
           i++;
        }
        return ans.toString();
    }
    public static void main(String[] args) {

    }

}
