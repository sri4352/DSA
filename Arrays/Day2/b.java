package Array.Day_2;
// Row Sum in a Matrix (GFG practice)
public class b {
    public static int[] rowSum(int mat[][]) {
        int n =mat.length;
        int [] ans =new int[n];
        for (int i =0;i<mat.length;i++)
        {
            int sum =0;
            for (int j =0;j<mat[i].length;j++)
            {
                sum +=mat[i][j];
            }
            ans[i] =sum;
        }
        return ans;

    }
    public static void main(String[] args) {

    }

}
