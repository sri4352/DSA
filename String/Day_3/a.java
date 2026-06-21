package String.Day_3;
// goat latin(leetcode 824)
public class a {
    public String toGoatLatin(String sentence) {
        String[] strArray =sentence.split(" ");
        StringBuilder sb =new StringBuilder();
        for (int i =0;i<strArray.length;i++)
        {
            char first = Character.toLowerCase(strArray[i].charAt(0));

            if (first == 'a' || first == 'e' || first == 'i' ||
                    first == 'o' || first == 'u') {
                sb.append(strArray[i]);
                sb.append("ma");
            }
            else
            {
                sb.append(strArray[i].substring(1));
                sb.append(strArray[i].charAt(0));
                sb.append("ma");
            }
            sb.append("a".repeat(i+1));
            if (i<strArray.length-1)
            {
                sb.append(" ");
            }
        }
        return sb.toString();

    }
    public static void main(String[] args) {

    }

}
