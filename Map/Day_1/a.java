package Map.Day_1;

import java.util.HashMap;

// continuous subarray sum(leetcode 523)
public class a {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map =new HashMap<>();
        map.put(0,-1);
        int sum =0;
        int n = nums.length;
        for (int i =0;i<n;i++)
        {
            sum +=nums[i];
            int remainder =sum%k;
            if (map.containsKey(remainder))
            {
                if (i-map.get(remainder)>=2)
                {
                    return true;
                }
            }
            else map.put(remainder,i);
        }
        return false;
    }
    public static void main(String[] args) {

    }

}

