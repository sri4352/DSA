package String.Day_7;

import java.util.Arrays;

// largest common prefix(leetcode 14)
public class c {
    // first approach
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ans =new StringBuilder();
        for (String s:strs)
        {
            if (s.length()==0)
            {
                return "";
            }
        }
       int min_length =strs[0].length();
        for (String s:strs)
        {
            min_length =Math.min(s.length(),min_length);
        }
        for (int i =0;i<min_length;i++)
        {
            char ch =strs[0].charAt(i);
            for (String s:strs)
            {
                if (s.charAt(i)!=ch)
                {
                    return ans.toString();
                }
            }
            ans.append(ch);
        }
        return ans.toString();
    }

    // 2nd approach
    public String longestCommonPrefix2(String[] strs) {
        for (String s:strs)
        {
            if (s.length()==0)
            {
                return "";
            }
        }
        Arrays.sort(strs);
        String first =strs[0];
        String last =strs[strs.length-1];
        int min_length =Math.min(first.length(),last.length());
        int i;
        for (i =0;i<min_length;i++)
        {
            if (first.charAt(i)!=last.charAt(i))
            {
                break;
            }
        }
        return first.substring(0,i);
    }
    public static void main(String[] args) {

    }

}


