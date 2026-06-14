package Array.Day_4;

import java.util.ArrayList;
import java.util.List;

// spiral matrix (leetcode 54 and GFG problem)
public class a {

    // Leetcode solution
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans =new ArrayList<>();
        int m =matrix.length;
        int n =matrix[0].length;
        int total_elements =m*n;
        int count =0;
        int starting_row =0;
        int ending_row =m-1;
        int starting_column =0;
        int ending_column =n-1;
        while (count<total_elements)
        {
            for (int i=starting_column;i<=ending_column && count<total_elements;i++)
            {
                ans.add(matrix[starting_row][i]);
                count++;
            }
            starting_row++;
            for (int i=starting_row; i<=ending_row && count<total_elements;i++)
            {
                ans.add(matrix[i][ending_column]);
                count++;
            }
            ending_column--;
            for (int i=ending_column;i>=starting_column && count<total_elements;i--)
            {
                ans.add(matrix[ending_row][i]);
                count++;
            }
            ending_row--;
            for (int i=ending_row; i>=starting_row && count<total_elements;i--)
            {
                ans.add(matrix[i][starting_column]);
                count++;
            }
            starting_column++;
        }
        return ans;
    }

    // gfg solution

    public ArrayList<Integer> spirallyTraverse(int[][] mat) {
       ArrayList<Integer> ans =new ArrayList<>();
        int m =mat.length;
        int n =mat[0].length;
        int total_elements =m*n;
        int count =0;
        int starting_row =0;
        int ending_row =m-1;
        int starting_column =0;
        int ending_column =n-1;
        while (count<total_elements)
        {
            for (int i=starting_column;i<=ending_column && count<total_elements;i++)
            {
                ans.add(mat[starting_row][i]);
                count++;
            }
            starting_row++;
            for (int i=starting_row; i<=ending_row && count<total_elements;i++)
            {
                ans.add(mat[i][ending_column]);
                count++;
            }
            ending_column--;
            for (int i=ending_column;i>=starting_column && count<total_elements;i--)
            {
                ans.add(mat[ending_row][i]);
                count++;
            }
            ending_row--;
            for (int i=ending_row; i>=starting_row && count<total_elements;i--)
            {
                ans.add(mat[i][starting_column]);
                count++;
            }
            starting_column++;
        }
        return ans;
    }
    public static void main(String[] args) {

    }

}

