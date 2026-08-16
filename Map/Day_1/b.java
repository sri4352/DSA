package Map.Day_1;

import java.util.*;

// find player with zero looses(leetcode 2225)
public class b {
    public List<List<Integer>> findWinners(int[][] matches) {
        int n =matches.length;
        HashMap<Integer,Integer> map =new HashMap<>();
        for (int i =0;i<n;i++)
        {
            map.put(matches[i][1], map.getOrDefault(matches[i][1],0)+1);
        }
        List<Integer> no_loose =new ArrayList<>();
        List<Integer> one_loose =new ArrayList<>();
        for (int i =0;i<n;i++)
        {
           if (map.get(matches[i][1])==1)
           {
               one_loose.add(matches[i][1]);
           }
           if (!map.containsKey(matches[i][0]))
           {
               no_loose.add(matches[i][0]);
               map.put(matches[i][0],2);
           }
        }
        Collections.sort(no_loose);
        Collections.sort(one_loose);
        List<List<Integer>> ans_list =new ArrayList<>();
        ans_list.add(no_loose);
        ans_list.add(one_loose);
        return ans_list;
    }
    public static void main(String[] args) {

    }

}


