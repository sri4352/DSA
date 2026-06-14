package Array.Day_2;
// Row with Max 1s in Rowwise Sorted(GFG practice)
public class d {
    public int rowWithMax1s(int[][] arr) {
        int row =arr.length;
        int column =arr[0].length;
        int ans =-1;
        int i =0;
        int j =column-1;
        while (i<row && j>=0)
        {
            if (arr[i][j]==1)
            {
                ans =i;
                j--;
            }
            else
            {
                i++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {

    }

}


