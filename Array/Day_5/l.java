
package Array.Day_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

//Sort a Matrix Diagonally(GFG practice)
public class l {
    public void diagonalSort(int[][] grid) {
        HashMap<Integer, ArrayList<Integer>> map =new HashMap<>();
        int m =grid.length;
        int n =grid[0].length;
        for (int i =0;i<m;i++)
        {
            for (int j =0;j<n;j++)
            {
                if (i==j)continue;
                else {
                    map.putIfAbsent(i-j,new ArrayList<>());
                    map.get(i-j).add(grid[i][j]);
                }
            }
        }
        for (int key:map.keySet())
        {
            Collections.sort(map.get(key));
        }
        for (int i =0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                ArrayList<Integer> arrayList = map.get(i - j);
                if (i == j) continue;
                if (i < j) {
                    int last_element = arrayList.get(arrayList.size() - 1);
                    grid[i][j] = last_element;
                    arrayList.remove(arrayList.size() - 1);
                } else {
                    int element = arrayList.get(j);
                    grid[i][j] = element;
                }
            }
        }
    }
    public static void main(String[] args) {

    }

}
