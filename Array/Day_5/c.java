package Array.Day_5;

import java.util.Arrays;

// 3 sum closest (leetcode 16 and GFG practice)
    public class c {
    public int threeSumClosest(int[] nums, int target) {
        int n =nums.length;
        Arrays.sort(nums);
        int closestSum =0;
        int diff =Integer.MAX_VALUE;
        for(int i =0;i<n-2;i++)
        {
            int j =i+1;
            int k =n-1;
            while (j<k)
            {
                int sum =nums[i]+nums[j]+nums[k];
                if (sum==target)return sum;
                if (Math.abs(target-sum)<diff)
                {
                    diff =Math.abs(target-sum);
                    closestSum =sum;
                }
                if (Math.abs(target-sum)==diff)
                {
                    diff =Math.abs(target-sum);
                    closestSum =Math.max(closestSum,sum);
                }
                if (sum<target)j++;
                else k--;
            }
        }
        return closestSum;
    }
    public static void main(String[] args) {

    }

}

