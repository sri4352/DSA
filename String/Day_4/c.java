package String.Day_4;
//Remove Consecutive Two Same(GFG practice)
public class c {
    public String removePair(String s) {
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
        if (ans.length()==0)
        {
            return "-1";
        }
        else return ans.toString();
    }
    public static void main(String[] args) {

    }

}

