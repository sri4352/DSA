package Map.Day_4;

// leetcode 3121

import java.util.Arrays;

public class g {
    public int numberOfSpecialChars(String word) {
        int [] small_last_occurance =new int[26];
        int [] capital_first_occurance =new int[26];
        Arrays.fill(small_last_occurance,-1);
        Arrays.fill(capital_first_occurance,-1);
        for (int i =0;i<word.length();i++)
        {
            char ch =word.charAt(i);
            if (Character.isLowerCase(ch))
            {
                small_last_occurance[ch-'a'] =i;
            }
            else {
                if (capital_first_occurance[ch - 'A'] == -1) capital_first_occurance[ch-'A'] =i;
            }
        }
        int count =0;
        for (int i =0;i<26;i++)
        {
            if (small_last_occurance[i]!=-1 && capital_first_occurance[i]!=-1 && small_last_occurance[i]<capital_first_occurance[i]) count++;
        }
        return count;
    }

}
