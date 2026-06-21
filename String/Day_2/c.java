package String.Day_2;
//rearrange space between words(leetcode 1592)
public class c {
    public String reorderSpaces(String text) {
        StringBuilder ans =new StringBuilder();
        int no_space =0;
        for (int i =0;i<text.length();i++)
        {
            if (text.charAt(i)==' ')
            {
                no_space++;
            }
        }
        String[] strArr = text.trim().split("\\s+");
        int no_word =strArr.length;
        if (no_word == 1) {
            ans.append(strArr[0]);
            ans.append(" ".repeat(no_space));
            return ans.toString();
        }
        int zero_after =no_space/(no_word-1);
        int zero_last =no_space%(no_word-1);

        for (int i =0;i<strArr.length;i++)
        {
            ans.append(strArr[i]);
            if (i<strArr.length-1)
            {
                ans.append(" ".repeat(zero_after));
            }
        }
        if (zero_last>0)
        {
            ans.append(" ".repeat(zero_last));
        }
        return ans.toString();
    }
    public static void main(String[] args) {

    }

}

