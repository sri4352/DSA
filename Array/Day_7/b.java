package Array.Day_7;

import java.util.ArrayList;
import java.util.Arrays;

// increasing triplet subsequence(leetcode 334)
public class b {
    public boolean increasingTriplet(int[] nums) {
        int n1 =Integer.MAX_VALUE;
        int n2 =Integer.MAX_VALUE;
        for (int i =0;i<nums.length;i++)
        {
            int n3 =nums[i];
            if (n1>=n3)n1 =n3;
            else if (n2>=n3) {
                n2 =n3;
            }
            else return true;
        }
        return false;
    }
    public static void main(String[] args) {

    }

}

