package Array.Day_2;

import java.util.ArrayList;

// Transpose of a Matrix(LEETCODE :867)
// also available on GFG
public class g {
    public int[][] transpose(int[][] matrix) {
        int m =matrix.length;
        int n =matrix[0].length;
        int [][] ans =new int[n][m];
        for (int i =0;i<ans.length;i++)
        {
            for (int j =0;j<ans[0].length;j++)
            {
                ans[i][j] =matrix[j][i];
            }
        }
        return ans;
    }
    public ArrayList<ArrayList<Integer>> transposee(int[][] mat)
    {
        ArrayList<ArrayList<Integer>> ans =new ArrayList<>();
        for (int i=0;i<mat[0].length;i++)
        {
            ans.add(new ArrayList<Integer>());
            for (int j=0;j<mat.length;j++)
            {
                ans.get(i).add(mat[j][i]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
