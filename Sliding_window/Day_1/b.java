package Sliding_window.Day_1;

// leetcode 438
import java.util.ArrayList;
import java.util.List;

public class b {
    public boolean check_all_zero(int [] arr)
    {
        for (int i :arr)
        {
            if (i!=0)return false;
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans =new ArrayList<>();
        int len =s.length();
        int n =p.length();
        int [] arr =new int[26];
        for (int i =0;i<n;i++)
        {
            arr[p.charAt(i)-'a']++;
        }
        int j=0;
        int i =0;
        while (j<len)
        {
            arr[s.charAt(j)-'a']--;
            if (j-i+1==n)
            {
                if (check_all_zero(arr)) {
                    ans.add(i);
                }
                arr[s.charAt(i)-'a']++;
                i++;
            }
            j++;
        }
        return ans;
    }
}
