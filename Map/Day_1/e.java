package Map.Day_1;

import java.util.HashMap;

// no of good pattern(leetcode 1512)
public class e {
    public int numIdenticalPairs(int[] nums) {
        int result =0;
        int n =nums.length;
        HashMap<Integer,Integer> hashMap =new HashMap<>();
        for (int i =0;i<n;i++)
        {
            if (!hashMap.containsKey(nums[i]))
            {
                hashMap.put(nums[i],1);
            }
            else {
                result += hashMap.get(nums[i]);
                hashMap.put(nums[i], hashMap.get(nums[i]) + 1);
            }
        }
        return result;
    }
    public static void main(String[] args) {

    }

}

