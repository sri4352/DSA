package Searching_Sorting.Day_6;

import java.util.Arrays;

//The Painter's Partition Problem-II(GFG practice)
public class b {
    boolean isPossible(int [] arr,int v,int s)
    {
        int count_sum =0;
        int count =1;
        for (int i =0;i<arr.length;i++)
        {
            if (arr[i]>v)return false;
            if (count_sum+arr[i]>v)
            {
                count++;
                count_sum =arr[i];
                if (count>s)
                {
                    return false;
                }
            }
            else count_sum+=arr[i];
        }
        return true;
    }
    public int minTime(int[] arr, int k) {
        if (k>arr.length)
        {
            return -1;
        }
        int i =0;
        int j = Arrays.stream(arr).sum();
        int ans =-1;
        while (i<=j)
        {
            int mid =i+(j-i)/2;
            if (isPossible(arr,mid,k))
            {
                ans =mid;
              j =mid-1;
            }
            else i =mid+1;
        }
        return ans;
    }
    public static void main(String[] args) {

    }

}
