package Map.Day_3;

import java.util.HashMap;
import java.util.Map;

// minimum no. of pushes to type a word(leetcode 3014)
public class c {
    // approach 1
    public int minimumPushes(String word) {
        if (word.length() <= 8) {
            return word.length();
        }
        int assign_key = 2;
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            if (assign_key > 9) assign_key = 2;
            map.put(assign_key, map.getOrDefault(assign_key, 0) + 1);
            result = result + map.get(assign_key);
            assign_key++;
        }
        return result;
    }

    // approach 2 best
    public int minimumPush(String word) {
        int n = word.length();
        if (n <= 8) {
            return word.length();
        }
        int result = 0;

        for (int i = 0; i < n; i++) {
            result = result + (i / 8) + 1;
        }
        return result;
    }
}
