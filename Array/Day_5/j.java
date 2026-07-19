
package Array.Day_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

//diagonally traverse (leetcode 498)
public class j {
    public int[] findDiagonalOrder(int[][] mat) {
        int m =mat.length;
        int n =mat[0].length;
        int [] ans =new int[m*n];
        int idx =0;
        HashMap<Integer, ArrayList<Integer>> map =new HashMap<>();
        for (int i =0;i<m;i++)
        {
            for (int j =0;j<n;j++)
            {
                map.putIfAbsent(i+j,new ArrayList<>());
                map.get(i+j).add(mat[i][j]);
            }
        }
        for (int key =0;key<=m+n-2;key++)
        {
            if (key%2==0)
            {
                Collections.reverse(map.get(key));
            }
        }
        for (int key :map.keySet())
        {
            ArrayList<Integer> arrayList =map.get(key);
            for (int i =0;i<arrayList.size();i++)
            {
                ans[idx]=arrayList.get(i);
                idx++;
            }
        }
        return ans;

    }
    public static void main(String[] args) {

    }

}
