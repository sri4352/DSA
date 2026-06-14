package Array.Day_3;

import java.util.ArrayList;

// Move all negative elements to end(GFG practice)
public class a {
    public void segregateElements(int[] arr) {
        int n =arr.length;
        ArrayList<Integer> temp =new ArrayList<>(n);
        for (int i =0;i<n;i++)
        {
            if (arr[i]>=0)
            {
                temp.add(arr[i]);
            }
        }
        for (int i =0;i<n;i++)
        {
            if (arr[i]<0)
            {
                temp.add(arr[i]);
            }
        }
        for (int i =0; i<temp.size();i++)
        {
           arr[i] =temp.get(i);
        }
    }
    public static void main(String[] args) {

    }

}
