package Map.Day_4;

// leetcode 966

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class e {
    Set<String> exact_set =new HashSet<>();
    HashMap<String,String> lowercase_map =new HashMap<>();
    HashMap<String,String>mark_vowel =new HashMap<>();
    public String marked_word (String s)
    {
        StringBuilder temp =new StringBuilder();
        for (int i =0;i<s.length();i++)
        {
            if (isVowel(s.charAt(i)))  temp.append("*");
             else temp.append(s.charAt(i));
        }
        return temp.toString();
    }

    public boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public String check_for_match(String s)
    {
        String lower_case =s.toLowerCase();
        if (exact_set.contains(s))return s;
        if (lowercase_map.containsKey(lower_case))return lowercase_map.get(lower_case);
        String marked_word =marked_word(lower_case);
        if (mark_vowel.containsKey(marked_word))return mark_vowel.get(marked_word);
        return "";
    }

    public String[] spellchecker(String[] wordlist, String[] queries) {
        mark_vowel.clear();
        lowercase_map.clear();
        exact_set.clear();
        for (String word :wordlist)
        {
           exact_set.add(word);
           String lower_word =word.toLowerCase();
           lowercase_map.putIfAbsent(lower_word,word);
           String marked_word =marked_word(lower_word);
           mark_vowel.putIfAbsent(marked_word,word);
        }
        String[] result =new String[queries.length];
        for (int i =0;i<queries.length;i++)
        {
            result[i] =check_for_match(queries[i]);
        }
        return result;
    }
}
