package String.Day_7;
// reverse vowel of string (leetcode 345)
public class d {
    public String reverseVowels(String s) {
        char [] arr =s.toCharArray();
        int i =0;
        int j =arr.length-1;
        while (i<=j)
        {
            if ("aeiouAEIOU".indexOf(arr[i])==-1)
            {
                i++;
            }
            else if ("aeiouAEIOU".indexOf(arr[j])==-1)
            {
                j--;
            }
            else
            {
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
