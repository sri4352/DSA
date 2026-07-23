
package Array.Day_7;

import java.util.ArrayList;

//sum of even no after queries
public class a {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int even_sum =0;
        ArrayList<Integer> arrayList =new ArrayList<>();
        for (int i:nums)
        {
            if (i%2==0)even_sum+=i;
        }
        for (int i =0;i<queries.length;i++)
        {
            int index =queries[i][1];
            int value =queries[i][0];
            if (nums[index]%2==0)even_sum =even_sum-nums[index];
           nums[index] =nums[index]+value;
           if (nums[index]%2==0)even_sum =even_sum+nums[index];
           arrayList.add(even_sum);
        }
        int [] ans =new int[arrayList.size()];
        for (int i =0;i<arrayList.size();i++)
        {
            ans [i] =arrayList.get(i);
        }
        return ans;
    }
    static void main() {

    }
}
