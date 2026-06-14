package Array.Day_2;
// missing in array (both Leetcode 268 and GFG)
public class a {
    // LEETCODE solution
    public int missingNumber(int[] nums) {
        long n= nums.length;
        long ans =0;
        long total_sum =n*(n+1)/2;
        long array_sum =0;
        for (int i:nums)
        {
            array_sum+=(long)i;
        }
        ans =total_sum-array_sum;
        return (int)ans;
    }

    // GFG solution
    int missingNum(int arr[]) {
        long n= arr.length+1;
        long ans =0;
        long total_sum =n*(n+1)/2;
        long array_sum =0;
        for (int i:arr)
        {
            array_sum+=(long)i;
        }
        ans =total_sum-array_sum;
        return (int)ans;
    }
    public static void main(String[] args) {

    }

}
