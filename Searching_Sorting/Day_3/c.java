package Searching_Sorting.Day_3;
// search in 2D array(leetcode 74 and GFG Practice)
public class c {
    // leetcode solution
    public boolean searchMatrix(int[][] matrix, int target) {
        int row =matrix.length;
        int column =matrix[0].length;
        int i =0;
        int j =row*column-1;
        while (i<=j)
        {
            int mid =i+(j-i)/2;
            int r =mid/column;
            int c =mid%column;
            if (matrix[r][c]==target)return true;
            else if (matrix[r][c]>target) {
                j =mid-1;
            }
            else i =mid+1;
        }
        return false;
    }
    public static void main(String[] args) {

    }

}

