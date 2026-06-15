package Searching_Sorting.Day_1;
// Equilibrium Point (GFG practice)(Leetcode :724)
public class e {
    // leetcode solution
    public int pivotIndex(int[] nums) {
        int total_sum =0;
        for (int i:nums)
        {
            total_sum+=i;
        }
        int prefix_sum =0;
        for (int i =0;i<nums.length;i++)
        {
            int infix_sum =total_sum-prefix_sum-nums[i];
            if (prefix_sum==infix_sum)return i;
            prefix_sum+=nums[i];
        }
        return -1;
    }
    // gfg solution
    public static int findEquilibrium(int arr[]) {
        int total_sum =0;
        for (int i:arr)
        {
            total_sum+=i;
        }
        int prefix_sum =0;
        for (int i =0;i<arr.length;i++)
        {
            int infix_sum =total_sum-prefix_sum-arr[i];
            if (prefix_sum==infix_sum)return i;
            prefix_sum+=arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {

    }

}
