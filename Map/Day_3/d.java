package Map.Day_3;

import java.util.Arrays;

// minimum no. of pushes to type a word 2(leetcode 3016)
public class d {
    public int minimumPushes(String word) {
        int [] map =new int[26];
        int result =0;
        int n =word.length();
        for (int i =0;i<n;i++)
        {
            map[word.charAt(i)-'a']++;
        }
        Arrays.sort(map);
        int j =0;
        for (int i =25;i>=0;i--)
        {
            if (map[i]==0)continue;
            result+= map[i] * ((j / 8) + 1);
            j++;
        }
        return result;
    }
}

