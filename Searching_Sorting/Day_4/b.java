package Searching_Sorting.Day_4;

import java.util.ArrayList;
import java.util.List;

//find k closest element (leetcode 658 and GFG problem)
public class b {
    // 1st approach
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans =new ArrayList<>();
        int i =0;
        int j =arr.length-1;
        while (j-i>=k)
        {
            if (Math.abs(x-arr[i])>Math.abs(arr[j]-x))
            {
                i++;
            }
            else j--;
        }
        for (int a =i;a<=j;a++)
        {
            ans.add(arr[a]);
        }
        return ans;
    }
    // 2nd approach
    public int lowerBound(int[]a,int target)
    {
        int ans =-1;
        int i =0;
        int j =a.length-1;
        while (i<=j)
        {
            int mid =i+(j-i)/2;
            if (a[mid]>target)
            {
                j =mid-1;
            }
            else
            {
                ans =i;
                i=mid+1;
            }
        }
        return ans;
    }
    public List<Integer> findClosestElement(int[] arr, int k, int x) {
        List<Integer> ans =new ArrayList<>();
        int i =lowerBound(arr,x);
        int j =i+1;
        while (j - i - 1 < k) {
                if (i < 0) {
                    j++;
                } else if (j >= arr.length) {
                    i--;
                } else if (x - arr[i] <= arr[j] - x) {
                    i--;
                } else {
                    j++;
                }
        }
        for (int p = i + 1; p < j; p++) {
                ans.add(arr[p]);
        }
        return ans;
    }
    public static void main(String[] args) {

    }

}
