package Searching_Sorting.Day_4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static java.util.Arrays.binarySearch;

//k- diff pair in an array(leetcode 532 and GFG practice)
public class a {
    //first approach (using sliding window) leetcode solution
    public int findPairs(int[] nums, int k)
    {
        ArrayList<Integer> ans =new ArrayList<>();
        Arrays.sort(nums);
        if (nums.length==1 && k==0)
        {
            return 0;
        }
        int i =0;
        int j =i+1;
        while (j<nums.length)
        {
            int diff =(nums[j]-nums[i]);
            if (diff==k)
            {
                if (ans.isEmpty() || ans.getLast()!=nums[i])
                {
                    ans.add(nums[i]);
                }
                i++;
                j++;
            }
            else if (diff<k)
            {
                j++;
            }
            else i++;
            if (i==j)
            {
                j++;
            }
        }
        return ans.size();
    }
    // 2nd approach using binary search(best approach)
    public int findPair(int[] nums, int k)
    {
        Arrays.sort(nums);
        int count =0;
        if (nums.length==1 && k==0)
        {
            return 0;
        }
        for (int i =0;i<nums.length;i++)
        {
            int target =nums[i]+k;
            if (i>0 && nums[i]==nums[i-1])
            {
                continue;
            }
            if (binarySearch(nums, i + 1, nums.length - 1, target) != -1)
                count++;

        }
        return count;
    }
    public int binarySearch(int[] nums, int left, int right, int target) {

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1;
    }
    public static void main(String[] args) {

    }

}

