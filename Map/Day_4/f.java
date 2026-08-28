package Map.Day_4;

// leetcode 3761

import java.util.HashMap;

public class f {
    public int getReverse(int n) {
        int rev = 0;

        while (n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }

        return rev;
    }
    public int minMirrorPairDistance(int[] nums) {
        int ans =Integer.MAX_VALUE;
        HashMap<Integer,Integer> hashMap =new HashMap<>();
        int n =nums.length;
        for (int i = 0; i < n; i++)
        {
            if (hashMap.containsKey(nums[i]))ans =Math.min(ans,i-hashMap.get(nums[i]));
            hashMap.put(getReverse(nums[i]),i);
        }
        if (ans ==Integer.MAX_VALUE) {
            return -1;
        }
        return ans;
    }
}
