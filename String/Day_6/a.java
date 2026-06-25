package String.Day_6;
// remove all occurrences of a substring(leetcode 1910)
public class a {
    public String removeOccurrences(String s, String part) {
        StringBuilder ans =new StringBuilder(s);
        int part_length =part.length();
        int i=0;
        while (i!=-1)
        {
            i =ans.indexOf(part);
            if (i!=-1)
            {
                ans.delete(i,part_length+i);
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {

    }

}
