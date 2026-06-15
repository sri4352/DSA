package Searching_Sorting.Day_1;
// Binary Search(leetcode 704 and GFG practice)
public class binary_search {
    // leetcode solution
    public int search(int[] nums, int target) {
        int i =0;
        int j =nums.length-1;
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
    // GFG practice
    public boolean binarySearch(int[] arr, int k) {
        int i =0;
        int j =arr.length-1;
        while (i<=j)
        {
            int mid =i+(j-i)/2;
            if (arr[mid]==k)return true;
            else if (arr[mid]>k)
            {
                j =mid-1;
            }
            else
            {
                i =mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {

    }

}
