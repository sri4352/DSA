package String.Day_3;
// toggle case (GFG practice)
public class c {
    public String toggleCase(String s) {
        StringBuilder sb =new StringBuilder();
        for (int i =0;i<s.length();i++)
        {
            char ch =s.charAt(i);
            if (ch>='a' && ch<='z')
            {
                sb.append(Character.toUpperCase(ch));
            }
            else
            {
                sb.append(Character.toLowerCase(ch));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {

    }

}
