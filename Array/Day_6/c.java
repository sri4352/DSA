package Array.Day_6;

import java.util.HashMap;

// contains duplicate part2(leetcode 219)
public class c {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer>hashMap =new HashMap<>();
        int n =nums.length;
        for (int i =0; i<n; i++)
        {
            int element =nums[i];
            if (!hashMap.containsKey(element))
            {
                hashMap.put(nums[i],i);
            }
           else if (hashMap.containsKey(nums[i]) && Math.abs(i-hashMap.get(element))<=k)
            {
                return true;
            }
            else hashMap.put(element,hashMap.get(element)+1);
        }
        return false;
    }
    public static void main(String[] args) {

    }

}




