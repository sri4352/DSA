package Array.Day_3;

import java.util.ArrayList;

// find duplicate no(leetcode :287)
// also in GFG practice
public class b {
    // leetcode solution
    public int findDuplicate(int[] nums) {
        int ans =-1;
        for (int i =0;i<nums.length;i++)
        {
            int idx =Math.abs(nums[i]);
            if (nums[idx]<0)
            {
               ans =idx;
               return ans;
            }
            else
            {
                nums[idx]=-1*nums[idx];
            }
        }
        return ans;
    }

    // GFG solution
    public ArrayList<Integer> findDuplicates(int[] arr) {
        int n =arr.length;
        int [] freq =new int[n+1];
        ArrayList<Integer> ans =new ArrayList<>();
        for (int i:arr)
        {
            freq[i]++;
        }
        for (int i =0;i<freq.length;i++)
        {
            if (freq[i]>=2)
            {
                ans.add(i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {

    }

}
