package Searching_Sorting.Day_2;

public class c {
    public int findMin(int[] nums) {
        int i =0;
        int j =nums.length-1;
        while (i<j)
        {
            int mid =i+(j-i)/2;
            if (nums[mid]>nums[j])
            {
                i =mid+1;
            }
            else j =mid;
        }
        return nums[j];
    }
    public static void main(String[] args) {

    }

}
