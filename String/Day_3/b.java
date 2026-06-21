package String.Day_3;
// detect capital(leetcode 520)
public class b {
    public boolean detectCapitalUse(String word) {
        char first =word.charAt(0);
        if (first>='A' && first<='Z')
        {
            String remain =word.substring(1);
           if (remain.equals(remain.toLowerCase()))
           {
               return true;
           }
           else if (remain.equals(remain.toLowerCase()))
           {
               return true;
           }
           else return false;
        }
        else
        {
            return word.equals(word.toLowerCase());
        }
    }
    public static void main(String[] args) {

    }

}


