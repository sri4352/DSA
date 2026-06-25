package String.Day_6;
// palindromic substring(leetcode 647)
public class f {
    public int match(String s,int i,int j)
    {
        int count =0;
        while (i>=0 && j<s.length() && s.charAt(i)==s.charAt(j))
        {
            count++;
            i--;
            j++;
        }
        return count;
    }
    public int countSubstrings(String s) {
        int n =s.length();
        int count =0;
        for (int center =0;center<n;center++)
        {
            count=count+match(s,center,center);
            count =count+match(s,center,center+1);
        }
        return count;
    }
    public static void main(String[] args) {

    }

}


