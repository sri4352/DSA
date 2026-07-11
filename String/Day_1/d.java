package String.Day_1;
import java.util.*;
// no of matching subsequences(leetcode 792)
class d{
    public int numMatchingSubseq(String s, String[] words) {

        int count = 0;

        Map<Character, ArrayList<Integer>> mp = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            mp.putIfAbsent(ch, new ArrayList<>());
            mp.get(ch).add(i);
        }

        for (String word : words) {

            int prev = -1;
            boolean found = true;

            for (char ch : word.toCharArray()) {

                if (!mp.containsKey(ch)) {
                    found = false;
                    break;
                }

                List<Integer> list = mp.get(ch);

                int index = Collections.binarySearch(list, prev + 1);

                if (index < 0)
                    index = -(index + 1);

                if (index == list.size()) {
                    found = false;
                    break;
                }

                prev = list.get(index);
            }

            if (found)
                count++;
        }

        return count;
    }
    public static void main(String[] args) {

    }

}

