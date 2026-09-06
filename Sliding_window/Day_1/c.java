package Sliding_window.Day_1;

// leetcode 209 and GFG practice

public class c {
    public int minSubArrayLen(int target, int[] nums) {
        int sum =0;
        int i =0;
        int j =0;
        int n =nums.length;
        int min_len =n+1;
        while (j<n)
        {
            sum =sum+nums[j];
            while (sum>=target)
            {
                min_len =Math.min(min_len,j-i+1);
                sum =sum-nums[i];
                i++;
            }
            j++;
        }
       if (min_len==n+1)return 0;
       return min_len;
    }
}
