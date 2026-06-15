package Searching_Sorting.Day_1;

import java.util.ArrayList;
import java.util.List;

// find the peaks (leetcode 2951)
public class d {
    public List<Integer> findPeaks(int[] mountain) {
        List<Integer> ans =new ArrayList<>();
        for (int i =1;i<mountain.length-1;i++)
        {
            if (mountain[i]>mountain[i-1] && mountain[i]>mountain[i+1])
            {
                ans.add(i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {

    }

}
