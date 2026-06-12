package Array.Day_2;
// columnn sum
public class e {
    public int []columnSum(int [][] a)
    {
        int n =a[0].length;
        int [] ans =new int[n];
        for (int i =0;i<a[0].length;i++)
        {
            int sum =0;
            for (int j =0;j<a.length;j++)
            {
                sum+=a[j][i];
            }
            ans[i] =sum;
        }
        return ans;
    }
    public static void main(String[] args) {

    }

}
