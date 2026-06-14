package Array.Day_1;

// Reverse String (Leetcode 344)
// same problem also in GFG
public class f {
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
        char [] arr =s.toCharArray();
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
        String s_new =new String(arr);
        return s_new;
    }
    public static void main(String[] args) {

    }

}
