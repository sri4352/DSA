package Array.Day_3;

import java.util.ArrayList;

// missing and repeating (GFG practice)
public class c {
   public ArrayList<Integer> findTwoElement(int arr[]) {
       ArrayList<Integer> ans =new ArrayList<>();
       int n = arr.length;
       int missing =-1;
       int repeating =-1;
       for (int i =0;i<n;i++)
       {
           int idx =Math.abs(arr[i]);
           if (arr[idx-1]>0)
           {
               arr[idx-1]=-arr[idx-1];
           }
           else
           {
               repeating =idx;
           }
       }
       for (int i=0;i<arr.length;i++)
       {
           if (arr[i]>0)
           {
               ans.add(repeating);
               ans.add(i+1);
               break;
           }
       }
       return ans;
    }

    // 2nd method
    public ArrayList<Integer> missingAndDuplicate(int [] arr)
    {
        ArrayList<Integer> ans =new ArrayList<>();
        int n =arr.length;
        int i =0;
        while (i<n)
        {
            int idx =arr[i]-1;
            if (arr[idx]!=arr[i])
            {
                int temp =arr[idx];
                arr[idx] =arr[i];
                arr[i] =temp;
            }
            else
            {
                i++;
            }
        }
        for (int j =0;j<n;j++)
        {
            if (arr[j]!=j+1)
            {
                ans.add(arr[j]);
                ans.add(j+1);
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {

    }

}

