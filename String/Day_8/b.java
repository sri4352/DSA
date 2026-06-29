package String.Day_8;
//find index of first substring in string(leetcode 28)
public class b {
    public int strStr(String haystack, String needle) {
        int m =haystack.length();
        int n =needle.length();
        for (int i =0;i<=m-n;i++)
        {
            for (int j =0;j<n;j++)
            {
                if (needle.charAt(j)!=haystack.charAt(j+i))
                {
                    break;
                }
                if (j==n-1)
                {
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {

    }

}
