package String.Day_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// is Subsequence(leetcode 392)
public class c {
    // first approach
    public boolean isSubsequence(String s, String t) {
        int i =0;
        int j =0;
        while (i<s.length() && j<t.length())
        {
            if (s.charAt(i)==t.charAt(j))
            {
                i++;
                j++;
            }
            else j++;
        }
        return i ==s.length();
    }
    // second approach
    public boolean isSubsequences(String s, String t) {
        Map<Character,ArrayList<Integer>>mp =new HashMap<>();
        for (int i =0; i<t.length(); i++)
        {
            char ch =t.charAt(i);
            mp.putIfAbsent(ch,new ArrayList<>());
            mp.get(ch).add(i);
        }
        int pre =-1;
        for (int i =0;i<s.length();i++)
        {
            char ch =s.charAt(i);
            if (!mp.containsKey(ch))return false;
            ArrayList<Integer> indices =mp.get(ch);
            int idx = Collections.binarySearch(indices, pre + 1);
            if (idx<0)idx =-idx-1;
            if (idx ==indices.size())return false;
            pre =indices.get(idx);
        }
        return true;
    }
    static void main() {

    }
}

