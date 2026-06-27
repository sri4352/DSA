package String.Day_7;
// reverse only letters(leetcode 917 and GFG practice)
public class b {
    public String reverseOnlyLetters(String s) {
        char [] arr = s.toCharArray();
        int i =0;
        int j =arr.length-1;
        while (i<=j)
        {
            if (!Character.isAlphabetic(arr[i]))
            {
                i++;
            } else if (!Character.isAlphabetic(arr[j])) {
                j--;
            }
            else {
                char temp =arr[i];
                arr[i] =arr[j];
                arr[j] =temp;
                i++;
                j--;
            }

        }
        String ans =new String(arr);
        return ans;
    }
    public static void main(String[] args) {

    }

}

