package Searching_Sorting.Day_1;
// sum of squares of special elements(leetcode :2778)
public class h {
    public int sumOfSquares(int[] nums) {
        int n =nums.length;
        int sum =0;
        for (int i =0;i<nums.length;i++)
        {
            if (n%(i+1)==0)
            {
                sum+=nums[i]*nums[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {

    }

}
