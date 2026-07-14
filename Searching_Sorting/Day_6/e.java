package Searching_Sorting.Day_6;

import java.util.Arrays;

//minimum cost to array equal(leetcode 2448)
public class e {
    public long findcost(int [] nums,int [] cost ,int mid)
    {
        long result =0;
        for (int i =0;i<nums.length;i++)
        {
            result += (long) Math.abs(nums[i] - mid) * cost[i];
        }
        return result;
    }
    public long minCost(int[] nums, int[] cost) {
        long ans =Integer.MAX_VALUE;
        int i =Arrays.stream(nums).min().getAsInt();
        int j = Arrays.stream(nums).max().getAsInt();
        while (i<=j)
        {
            int mid =i+(j-i)/2;
            long cost1 =findcost(nums,cost,mid);
            long cost2 =findcost(nums,cost,mid+1);
            ans =Math.min(cost1,cost2);
            if (cost1>cost2)
            {
              i =mid+1;
            }
            else j =mid-1;
        }
        return ans ==Integer.MAX_VALUE ?0:ans;
    }
    public static void main(String[] args) {

    }

}

