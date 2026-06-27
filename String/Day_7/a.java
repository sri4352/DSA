package String.Day_7;

// valid anagram (leetcode 242 and GFG practice)
public class a {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length())
        {
            return false;
        }
        int [] arr =new int[255];
        for (int i =0;i<s.length();i++)
        {
            arr[s.charAt(i)]++;
        }
        for (int i=0;i<t.length();i++)
        {
            arr[t.charAt(i)]--;
        }
        for (int i =0;i<arr.length;i++)
        {
            if (arr[i]!=0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

    }

}
