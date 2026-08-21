
package Map.Day_2;

import java.util.HashMap;

// count nice pair in an array(leetcode 1814)
public class c {
    public static int reverseNumber(int n) {
        int reverse = 0;

        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }

        return reverse;
    }
    public int countNicePairs(int[] nums) {
        long result =0;
        int n =nums.length;
        HashMap<Integer,Integer> hashMap =new HashMap<>();
        for (int i =0;i<n;i++)
        {
            nums[i] =nums[i]-reverseNumber(nums[i]);
            result =result+hashMap.getOrDefault(nums[i],0);
            hashMap.put(nums[i],hashMap.getOrDefault(nums[i],0)+1);
        }
        return (int)result % (1000000007);
    }
}
