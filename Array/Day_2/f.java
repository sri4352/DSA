package Array.Day_2;
// Search in a Matrix (GFG practice)
public class f {
    public boolean searchMatrix(int[][] mat, int x) {
        for (int i =0;i<mat.length;i++)
        {
            for (int j =0;j<mat[0].length;j++)
            {
                if (mat[i][j]==x)return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

    }

}
