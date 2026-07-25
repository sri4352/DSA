package Array.Day_7;
// set mismatch(leetcode 645)
public class e {
    public int[] findErrorNums(int[] nums) {
        int missing =-1;
        int duplicate =-1;
        int [] ans =new int[2];
        int n =nums.length;
        for (int i =0;i<n;i++)
        {
            int value =Math.abs(nums[i]);
            if (nums[value-1]<0)
                duplicate =value;
            else nums[value-1]*=-1;
        }
        ans[0] =duplicate;
        for (int i =0;i<n;i++)
        {
            if (nums[i]>0)
            {
                missing =i+1;
            }
        }
        ans[1] =missing;
        return ans;
    }
    public static void main(String[] args) {

    }

}



