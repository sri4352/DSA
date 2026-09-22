package String.Day_9;
// length of last word(leetcode 50)
public class e {
    public int lengthOfLastWord(String s) {
        String[] arr = s.trim().split("\\s+");
       return arr[arr.length-1].length();
    }
}
