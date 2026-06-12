package Array.Day_2;
// row with maximum ones (Leetcode 2643)
public class c {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int [] ans =new int[2];
        int row =-1;
        int max_zero =0;
        for (int i =0;i<mat.length;i++)
        {
            int no_of_zero =0;
            for (int j =0;j<mat[i].length;j++)
            {
                if(mat[i][j]==1)no_of_zero++;
            }
            if (no_of_zero>max_zero)
            {
                max_zero =no_of_zero;
                row =i;
                ans[0]=row;
                ans[1] =max_zero;
            }
        }
        return ans;
    }
    public static void main(String[] args) {

    }

}

