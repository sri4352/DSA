package Searching_Sorting.Day_3;
// single element in sorted array (leetcode 540 and GFG practice)
public class b {
    public int singleNonDuplicate(int[] nums) {
       int i =0;
       int j =nums.length-1;
       while (i<=j)
       {
           if (i==j)return nums[i];
           int mid =i+(j-i)/2;
           if (mid%2==0)
           {
               if (nums[mid]==nums[mid+1])
               {
                   i =mid+2;
               }
               else j =mid;
           }
           else
           {
               if (nums[mid]==nums[mid-1])
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
