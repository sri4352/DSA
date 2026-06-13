package Array.Day_3;

import java.util.HashMap;

//First Repeating Element (GFG practice)
public class d {
    public static int firstRepeated(int[] arr) {
        int n =arr.length;
        HashMap<Integer,Integer> ans =new HashMap<>();
        for (int i:arr)
        {
            ans.put(i, ans.getOrDefault(i, 0) + 1);
        }
       for (int i =0;i<n;i++)
       {
           if (ans.get(arr[i])>1)
           {
               return i+1;
           }
       }
        return -1;
    }
    public static void main(String[] args) {

    }

}

