package String.Day_3;
//Capitalize First Letter of Words(GFG practice)
public class e {
    public String convert(String s) {
        String[] strArray =s.split(" ");
        StringBuilder sb =new StringBuilder();
        for (int i =0;i<strArray.length;i++)
        {
            String word = strArray[i];

            sb.append(Character.toUpperCase(word.charAt(0)));
            sb.append(word.substring(1));
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

