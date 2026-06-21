package String.Day_2;
// capitalize the title (leetcode 2129)
public class d {
    public String capitalizeTitle(String title) {
        String[] strArr =title.split(" ");
        StringBuilder sb =new StringBuilder();
        for (int i =0;i<strArr.length;i++)
        {
            if (strArr[i].length()<=2)sb.append(strArr[i].toLowerCase());
            else
            {
                sb.append(Character.toUpperCase(strArr[i].charAt(0)))
                        .append(strArr[i].substring(1).toLowerCase());

            }
            if (i< strArr.length-1)
            {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {

    }

}

