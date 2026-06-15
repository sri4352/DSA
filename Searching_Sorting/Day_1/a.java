package Searching_Sorting.Day_1;
//First and Last in Sorted (GFG practice and leetcode 34)

import java.util.ArrayList;

public class a {
    // leetcode solution
    public int[] searchRange(int[] nums, int target) {
        int [] ans =new int[2];
        int i =0;
        int j =nums.length-1;
        int idx =-1;
        while (i<=j)
        {
            int mid =i+(j-i)/2;
            if (nums[mid]==target)
            {
                idx=mid;
                j =mid-1;
            } else if (nums[mid]<target) {
                i =mid+1;
            }
            else
            {
                j =mid-1;
            }
        }
        ans[0] =idx;
        i =0;
        j =nums.length-1;
        while (i<=j)
        {
            int mid =i+(j-i)/2;
            if (nums[mid]==target)
            {
                idx=mid;
                i =mid+1;
            } else if (nums[mid]<target) {
                i =mid+1;
            }
            else
            {
                j =mid-1;
            }
        }
        ans[1] =idx;
        return ans;
    }

    // GFG solution
    ArrayList<Integer> find(int arr[], int x){
       ArrayList<Integer> ans =new ArrayList<>();
        int i =0;
        int j =arr.length-1;
        int idx =-1;
        while (i<=j)
        {
            int mid =i+(j-i)/2;
            if (arr[mid]==x)
            {
                idx=mid;
                j =mid-1;
            } else if (arr[mid]<x) {
                i =mid+1;
            }
            else
            {
                j =mid-1;
            }
        }
        ans.add(idx);
        i =0;
        j =arr.length-1;
        while (i<=j)
        {
            int mid =i+(j-i)/2;
            if (arr[mid]==x)
            {
                idx=mid;
                i =mid+1;
            } else if (arr[mid]<x) {
                i =mid+1;
            }
            else
            {
                j =mid-1;
            }
        }
        ans.add(idx);
        return ans;
    }
    public static void main(String[] args) {

    }

}
