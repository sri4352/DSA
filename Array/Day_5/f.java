package Array.Day_5;
// rotate by 90 degree (anti clock-wise)(GFG practice)
public class f {
    public void rotateMatrix(int[][] matrix) {
        int n =matrix.length;
        for (int i =0;i<n;i++)
        {
            for (int j =i;j<n;j++)
            {
                int temp =matrix[i][j];
                matrix[i][j] =matrix[j][i];
                matrix[j][i] =temp;
            }
        }
        for (int i =0;i<n;i++)
        {
            int j =0;
            int k =n-1;
            while (j<k)
            {
                int temp =matrix[j][i];
                matrix[j][i] =matrix[k][i];
                matrix[k][i] =temp;
                j++;
                k--;
            }
        }
    }
    public static void main(String[] args) {

    }

}

