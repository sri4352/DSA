package Array.Day_6;

import java.util.Arrays;

// largest perimeter triangle(leetcode 976)
public class b {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n =nums.length;
        for (int i =n-1;i>=2;i--)
        {
            if (nums[i]<nums[i-1]+nums[i-2])return nums[i]+nums[i-1]+nums[i-2];
        }
        return 0;
    }
    public static void main(String[] args) {

    }

}
