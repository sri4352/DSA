package String.Day_3;
//Lower case to upper case(GFG practice)
public class d {
    String to_upper(String str) {
        StringBuilder sb =new StringBuilder();
        for (int i =0;i< str.length();i++)
        {
            char ch =(char) (str.charAt(i)-32);
            sb.append(ch);
        }
        return sb.toString();
    }
    public static void main(String[] args) {

    }

}
