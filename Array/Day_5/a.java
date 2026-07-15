package Array.Day_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 3 sum (leetcode 15) and GFG practice
public class a {
    public static List<List<Integer>> find(int [] arr,int target ,int i,int j)
    {
        List<List<Integer>> pair =new ArrayList<>();
        while (i<j)
        {
            if (arr[i]+arr[j]>target)j--;
           else if (arr[i]+arr[j]<target)i++;
            else
            {
                pair.add(new ArrayList<>(Arrays.asList(-1*target,arr[i],arr[j])));
                while (i<j && arr[i]==arr[i+1])i++;
                while (i<j && arr[j]==arr[j-1])j--;
                i++;
                j--;
            }
        }
        return pair;
    }

    // leetcode solution
    public List<List<Integer>> threeSum(int[] nums) {
        int n =nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans =new ArrayList<>();

        for (int i =0;i<n-2;i++)
        {
            if (i>0 && nums[i]==nums[i-1])continue;
            int num =nums[i];
            int target =-num;
            ans.addAll(find(nums,target,i+1,n-1));
        }
        return ans;
    }

    // GFG solution
    public static ArrayList<ArrayList<Integer>> triplets(int[] arr) {
        int n =arr.length;
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> ans =new ArrayList<>();
        for (int i =0; i<n-2;i++)
        {
            if (i>0 && arr[i]==arr[i-1])continue;
            int num =arr[i];
            int target =-1*num;
            int j =i+1;
            int k =n-1;
            while (j<k)
            {
                if (arr[j]+arr[k]>target)k--;
                else if (arr[j]+arr[k]<target) {
                    j++;
                }
                else
                {
                    ans.add(new ArrayList<>(Arrays.asList(num,arr[j],arr[k])));
                    while (j<k && arr[j]==arr[j+1])j++;
                    while (j<k && arr[k]==arr[k-1])k--;
                    j++;
                    k--;
                }
            }
        }
        return ans;

    }

    public static void main(String[] args) {

    }

}


