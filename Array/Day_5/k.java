
package Array.Day_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

//sort matrix by diagonals(leetcode 3446)
public class k {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        int [][] ans =new int[n][n];
        HashMap<Integer, ArrayList<Integer>>map =new HashMap<>();
        for (int i =0;i<n;i++)
        {
            for (int j =0;j<n;j++)
            {
                map.putIfAbsent(i-j,new ArrayList<>());
                map.get(i-j).add(grid[i][j]);
            }
        }
        for (int key :map.keySet())
        {
            Collections.sort(map.get(key));
        }
        for (int i =0;i<n;i++)
        {
            for (int j =0;j<n;j++)
            {
                ArrayList<Integer> arrayList =map.get(i-j);
               if (i>=j)
               {
                   int last_element =arrayList.get(arrayList.size()-1);
                   ans[i][j] =last_element;
                   arrayList.remove(arrayList.size()-1);
               }
               else
               {
                   int element =arrayList.get(i);
                   ans[i][j] =element;
               }
            }
        }
        return ans;
    }

    public static void main(String[] args) {

    }

}
