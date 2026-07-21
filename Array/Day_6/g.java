package Array.Day_6;
// celebrity problem(GFG practice)
public class g {
    public int celebrity(int mat[][]) {
        int n =mat.length;
        int [] arr =new int[n];
        for (int i =0;i<n;i++)
        {
            for (int j =0;j<n;j++)
            {
                if (mat[i][j]==1)
                {
                    arr[i]--;
                    arr[j]++;
                }
            }
        }
        for (int i =0;i<n;i++)
        {
            if (arr[i]==n-1)return i;
        }
        return -1;
    }
    public static void main(String[] args) {

    }

}
