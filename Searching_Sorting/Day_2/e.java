package Searching_Sorting.Day_2;
// minimum in rotated sorted array 2 (leetcode 154)
public class e {
    public  static int findPivot(int [] arr,int i,int j)
    {
        while (i<j)
        {
            while (i<j && arr[i]==arr[i+1])
            {
                i++;
            }
            while (i<j && arr[j]==arr[j-1])
            {
                j--;
            }
            int mid =i+(j-i)/2;
            if (arr[mid]>arr[j])
            {
                i =mid+1;
            }
            else j =mid;
        }
        return j;
    }
    public static int binarySearch(int [] arr,int i,int j,int target)
    {
        while (i<=j)
        {
            int mid =i+(j-i)/2;
            if (arr[mid]==target)return mid;
            else if (arr[mid]>target) {
                j =mid-1;

            }
            else i =mid+1;
        }
        return -1;
    }
    public int findMin(int[] nums) {
        int i =0;
        int j =nums.length-1;
        int pivot =findPivot(nums,i,j);
        int element_index =binarySearch(nums,0,pivot-1,nums[pivot]);
        if (element_index!=0)
        {
            return nums[element_index];
        }
        else element_index =binarySearch(nums,pivot,nums.length-1,nums[pivot]);
        return nums[element_index];
    }
    public static void main(String[] args) {

    }

}
