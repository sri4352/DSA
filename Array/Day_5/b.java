package Array.Day_5;
//Trapping Rain Water(leetcode 42 and GFG practice)
public class b {
    public int [] left_max(int [] arr)
    {
        int n =arr.length;
        int [] ans =new int [n];
        ans [0] =arr[0];
        int max =arr[0];
        for (int i=1;i<n;i++)
        {
            if (arr[i]>max)
            {
                max =arr[i];
            }
            ans[i] =Math.max(max,arr[i]);
        }
        return ans;
    }
    public int [] right_max(int [] arr)
    {
        int n =arr.length;
        int [] ans =new int [n];
        ans [n-1] =arr[n-1];
        int max =arr[n-1];
        for (int i=n-2;i>=0;i--)
        {
            if (arr[i]>max)
            {
                max =arr[i];
            }
            ans[i] =Math.max(max,arr[i]);
        }
        return ans;
    }
    public int trap(int[] height) {
        int n =height.length;
        int [] left_arr =left_max(height);
        int [] right_arr =right_max(height);
        int sum =0;
        for (int i =0;i<n;i++)
        {
            sum =sum+(Math.min(left_arr[i],right_arr[i])-height[i]);
        }
        return sum;
    }
    public static void main(String[] args) {

    }

}
