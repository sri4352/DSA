package String.Day_1;
// reverse a string  (leetcode 344 and GFG practice)
public class a {
    // leetcode solution
    public void reverseString(char[] arr) {
        int i =0;
        int j =arr.length-1;
        while (i<=j)
        {
            char temp =arr[i];
            arr[i] =arr[j];
            arr[j] =temp;
            i++;
            j--;
        }
    }
    // GFG solution
    public static String reverseString(String s) {
        String ans ="";
        int n =s.length();
        for (int i=n-1;i>=0;i--)
        {
            ans =ans+s.charAt(i);
        }
        return ans;
    }
    public static void main(String[] args) {

    }

}
