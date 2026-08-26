package Map.Day_4;

// leetcode 2131

import java.util.HashMap;
import java.util.Map;

public class c {
    public int longestPalindrome(String[] words) {
        HashMap<String,Integer> hashMap =new HashMap<>();
        int result =0;
        for (String word :words)
        {
            String reversed = new StringBuilder(word).reverse().toString();
            if (hashMap.getOrDefault(reversed,0)>0)
            {
                result+=4;
                hashMap.put(reversed,hashMap.get(reversed)-1);
            }
            else  hashMap.put(word,hashMap.getOrDefault(word,0)+1);
        }
        for (Map.Entry<String,Integer>entry :hashMap.entrySet())
        {
            String s =entry.getKey();
            int freq =entry.getValue();
            if (s.charAt(0)==s.charAt(1) && freq>0) {
                result += 2;
                break;
            }
        }
        return result;
    }
}
