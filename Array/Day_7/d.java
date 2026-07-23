
package Array.Day_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// kids with max candies (leetcode 1431)
public class d {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans =new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i =0;i<candies.length;i++)
        {
            if (candies[i]>max)max =candies[i];
        }
        for (int i =0;i<candies.length;i++)
        {
            if (candies[i]+extraCandies>=max)ans.add(true);
            else ans.add(false);
        }
        return ans;
    }
    public static void main(String[] args) {

    }

}
