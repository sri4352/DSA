package String.Day_2;

import java.util.ArrayList;
import java.util.Collections;

// Reverse Words in a string(leetcode 151 and GFG practice)
public class b {
    // leetcode solution
    public String reverseWord(String s) {
        StringBuilder sb =new StringBuilder();
        String [] arr =s.trim().split("\\s+");
        for (int i =arr.length-1;i>=0;i--)
        {
            sb.append(arr[i]);
            if (i>0)
            {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
    // GFG solution
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split("\\.+");

        for (int i = arr.length - 1; i >= 0; i--) {
            if (!arr[i].isEmpty()) {

                if (sb.length() > 0) {
                    sb.append(".");
                }

                sb.append(arr[i]);
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) {

    }

}


