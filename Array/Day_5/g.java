package Array.Day_5;

import java.util.*;

// group anagram (leetcode 49)
public class g {
    // approach 1
    public List<List<String>> groupAnagrams(String[] strs) {
        int n =strs.length;
        Map<String , ArrayList<String>> mp =new HashMap<>();
        List<List<String>> ans =new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String temp = strs[i];

            char[] ch = temp.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);

            mp.putIfAbsent(key, new ArrayList<>());
            mp.get(key).add(temp);
        }
        for (ArrayList<String> a:mp.values())
        {
            ans.add(a);
        }
        return ans;
    }
    public static void main(String[] args) {

    }

}

