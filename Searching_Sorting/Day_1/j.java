package Searching_Sorting.Day_1;
// sum of square numbers(leetcode 633 and GFG practice)
public class j {
    // approach 1(best)
    public boolean judgeSquareSum(int c) {
        long i = 0;
        long j = (long)Math.sqrt(c);

        while (i <= j) {
            long sum = i * i + j * j;

            if (sum == c) return true;
            else if (sum < c) i++;
            else j--;
        }

        return false;
    }
    // approach 2
    public boolean checkSquares(int c) {
        for (long a = 0; a * a <= c; a++) {
            long target = c - a * a;

            long low = 0;
            long high = target;

            while (low <= high) {
                long mid = low + (high - low) / 2;
                long square = mid * mid;

                if (square == target) {
                    return true;
                } else if (square < target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {

    }

}
