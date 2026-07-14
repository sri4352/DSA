
package Searching_Sorting.Day_6;

import java.util.ArrayList;
import java.util.Arrays;

// successful pair of spells and potions(leetcode 2300)
public class c {
    // brute force O(n*m) not useful
    public int[] successfulPair(int[] spells, int[] potions, long success) {
        int [] arr =new int[spells.length];
        int idx =0;
        for (int i =0;i<spells.length;i++)
        {
            int count =0;
            for (int j =0;j<potions.length;j++)
            {
                if (spells[i]*potions[j]>=success)count++;
            }
            arr[idx]=count;
            idx++;

        }
        return arr;
    }

    // optimized solution
    public int lowerBound(int [] arr,int i,int j,long target)
    {
        int idx =-1;
        while (i<=j)
        {
            int mid =i+(j-i)/2;
            if (arr[mid]>=target)
            {
                idx =mid;
                j=mid-1;
            }
            else i =mid+1;
        }
        return idx;
    }
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int m =spells.length;
        int n =potions.length;
        Arrays.sort(potions);
        int max_value =potions[n-1];
        ArrayList<Integer> ans =new ArrayList<>();
        for (int i =0;i<m;i++)
        {
            long minPotion = (success + spells[i] - 1) / spells[i];
            if (minPotion>max_value)
            {
                ans.add(0);
                continue;
            }
            int index =lowerBound(potions,0,n-1,minPotion);
            ans.add(n-index);
        }
        int [] arr =new int[ans.size()];
        for (int i =0;i<ans.size();i++)
        {
            arr[i] =ans.get(i);
        }
        return arr;
    }
    public static void main(String[] args) {

    }

}

