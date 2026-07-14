package Searching_Sorting.Day_6;

import java.util.Arrays;
// minimize maximize of an array (leetcode 2439)
public class d {
    public  boolean isPossible(int [] arr,int check)
    {
       long [] value =new long[arr.length];
       for (int i =0;i<arr.length;i++)
       {
           value[i] =arr[i];
       }
        for (int i =0;i<arr.length;i++)
        {
            if (value[i]>check)return false;
            long buffer =check-value[i];
            value[i+1] =value[i+1]-buffer;
        }
        return value[value.length-1]<=check;
    }
   public int minimizeArrayValue(int[] nums) {
        int i =1;
        int j = Arrays.stream(nums).max().getAsInt();
        int result =0;
        while (i<=j)
        {
            int mid =i+(j-i)/2;
            if(isPossible(nums,mid))
            {
                 result =mid;
                j =mid-1;
            }
            else i =mid+1;
        }
        return result;
    }
    public static void main(String[] args) {
    }

}
