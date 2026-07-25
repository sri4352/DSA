package Array.Day_7;
// where will be the ball fall (leetcode 1706)
public class f {
    public int[] findBall(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        int[] ans = new int[n];

        for (int ball = 0; ball < n; ball++) {

            int row = 0;
            int column = ball;
            boolean stuck = false;
            while (row < m && column <n) {

                if (grid[row][column] == 1) {

                    if (column == n - 1 || grid[row][column + 1] == -1) {
                        stuck = true;
                        break;
                    }
                    else {
                        column++;
                    }

                } else {

                    if (column == 0 || grid[row][column - 1] == 1) {
                        stuck = true;
                        break;
                    }
                    else {
                        column--;
                    }
                }

                row++;
            }

            if (stuck) {
                ans[ball] = -1;
            } else {
                ans[ball] = column;
            }
        }

        return ans;
    }
    public static void main(String[] args) {

    }

}

