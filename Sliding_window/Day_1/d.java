package Sliding_window.Day_1;

// leetcode 1456

public class d {
    public boolean isVowel(char ch)
    {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    public int maxVowels(String s, int k) {
        int max_vowel =0;
        int count_vowel =0;
        int i =0;
        int j =0;
        while (j<s.length())
        {
            if (isVowel(s.charAt(j)))count_vowel++;
            if (j-i+1==k)
            {
                max_vowel =Math.max(max_vowel,count_vowel);
                if (isVowel(s.charAt(i)))
                {
                    count_vowel--;
                }
                i++;
            }
            j++;
        }
        return max_vowel;
    }
}

