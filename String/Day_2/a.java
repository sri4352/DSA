package String.Day_2;
// URLify a given string(GFG practice)
public class a {
    static String URLify(String s) {
        StringBuilder ans  =new StringBuilder();
        for (int i =0;i<s.length();i++)
        {
            if (s.charAt(i)!=' ')
            {
                ans.append(s.charAt(i));
            }
            else ans.append("%20");
        }
        return ans.toString();
    }
    public static void main(String[] args) {

    }

}
