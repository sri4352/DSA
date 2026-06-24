package String.Day_5;
// consecutive characters(leetcode 1446)
public class a {
    public int maxPower(String s) {
        int count = 1;
        int max = 1;

        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                count++;
            } else {
                count = 1;
            }
            if(count>max)
            {
                max =count;
            }
        }

        return max;
    }
    public static void main(String[] args) {

    }

}

