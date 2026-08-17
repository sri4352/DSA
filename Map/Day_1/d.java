package Map.Day_1;
import java.util.HashMap;
import java.util.HashSet;
//word pattern (leetcode 290)
public class d {
    public boolean wordPattern(String pattern, String s) {
        int n =pattern.length();
        String [] words= s.split(" ");
        if (n!=words.length)return false;
        HashMap<String,Character> hashMap =new HashMap<>();
        HashSet<Character> used_char =new HashSet<>();
        for (int i =0;i<n;i++)
        {
            char ch =pattern.charAt(i);
            String w =words[i];
            if (hashMap.containsKey(w))
            {
                if (hashMap.get(w)!=ch) return false;
            }
            else
            {
                if (used_char.contains(ch))return false;
            }
            hashMap.put(w,ch);
            used_char.add(ch);
        }
        return true;
    }
    public static void main(String[] args) {

    }

}

