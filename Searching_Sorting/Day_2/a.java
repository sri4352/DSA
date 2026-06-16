package Searching_Sorting.Day_2;
// search in sorted rotated array (leetcode 33 and GFG practice)

// 1st approach using find pivot index
public class a {
    public int search(int[] nums, int target) {
        int i =0;
        int j =nums.length-1;
        int pivot =-1;
        while (i<j)
        {
            int mid =i+(j-i)/2;
            if (nums[mid]>nums[j])
            {
                i =mid+1;
            }
            else j =mid;
        }
        pivot =i;
        if (target>=nums[0] && target<=nums[pivot-1])
        {
            i =0;
            j =pivot-1;
            while (i<=j)
            {
                int mid =i+(j-i)/2;
                if (nums[mid]==target)
                {
                    return mid;
                } else if (nums[mid]>target) {
                    j =mid-1;
                }
                else
                {
                    i =mid+1;
                }
            }
            return -1;
        }
        if (target>=nums[pivot] && target<=nums[nums.length-1])
        {
            i =pivot;
            j =nums.length-1;
            while (i<=j)
            {
                int mid =i+(j-i)/2;
                if (nums[mid]==target)
                {
                    return mid;
                } else if (nums[mid]>target) {
                    j =mid-1;
                }
                else
                {
                    i =mid+1;
                }
            }
            return -1;
        }
        return -1;
    }

    // 2nd approach
    public int Search_rotate(int [] arr,int target)
    {
        int i =0;
        int j =arr.length-1;
        while (i<=j)
        {
            int mid =i+(j-i)/2;
            if (arr[mid]==target)return mid;
            else if (arr[mid]>=arr[i]) {
                if (target>=arr[i] && target<arr[mid])
                {
                    j =mid-1;
                }
                else i =mid+1;
            }
            else
            {
                if (target>arr[mid] && target<=arr[j])
                {
                    i =mid+1;
                }
                else j =mid-1;
            }
        }
        return -1;


    }
    public static void main(String[] args) {

    }

}
