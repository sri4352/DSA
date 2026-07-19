package Array.Day_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class i {
    public int[][] diagonalSort(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                map.putIfAbsent(i - j, new ArrayList<>());
                map.get(i - j).add(mat[i][j]);
            }
        }

        for (int key : map.keySet()) {
            Collections.sort(map.get(key));
        }
        for (int i=m-1;i>=0;i--)
        {
            for (int j =n-1;j>=0;j--)
            {
                ArrayList<Integer> arrayList =map.get(i-j);
                int last_element =arrayList.get(arrayList.size()-1);
                mat[i][j] =last_element;
                arrayList.remove(arrayList.size()-1);
            }
        }
        return mat;
    }
    public static void main(String[] args) {

    }

}

