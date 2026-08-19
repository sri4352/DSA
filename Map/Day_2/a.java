package Map.Day_2;

import java.util.ArrayList;
import java.util.HashMap;

// equal row and column pair(leetcode 2352)
public class a {
    // approach 1
    public int equalPair(int[][] grid) {
        int count =0;
        int n =grid.length;
        for (int i =0;i<n;i++)
        {
            for (int j =0;j<n;j++)
            {
                boolean is_true =true;
                for (int k =0;k<n;k++)
                {
                    if (grid[i][k]!=grid[k][j])
                    {
                        is_true =false;
                        break;
                    }
                }
                if (is_true)count++;
            }
        }
        return count;
    }

    // approach 2 (best)
    public int equalPairs(int[][] grid) {
        int count =0;
        int n = grid.length;
        HashMap<ArrayList, Integer> hashMap =new HashMap<>();
        for (int i =0;i<n;i++)
        {
           ArrayList<Integer> arrayList =new ArrayList<>();
            for (int j =0;j<n;j++)
            {
               arrayList.add(grid[i][j]);
            }
            hashMap.put(arrayList,hashMap.getOrDefault(arrayList,0)+1);
        }
        for (int i =0;i<n;i++)
        {
            ArrayList<Integer> arrayList =new ArrayList<>();
            for (int j =0;j<n;j++)
            {
               arrayList.add(grid[j][i]);
            }
            count+=hashMap.getOrDefault(arrayList,0);
        }
        return count;
    }
    public static void main(String[] args) {

    }

}

