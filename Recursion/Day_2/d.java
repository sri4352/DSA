package Recursion.Day_2;
//get Maximum in Generated array(leetcode 1646)
public class d {
    public int getMaximumGenerated(int n) {
        if (n==0)return 0;
        int [] arr =new int[n+1];
        arr[0] =0;
        arr[1] =1;
        for (int i =2;i<arr.length;i++)
        {
            if(i%2==0)
            {
                arr[i]=arr[i/2];
            }
            else arr[i] =arr[i/2]+arr[i/2+1];
        }
        int maxx =Integer.MIN_VALUE;
        for (int i =0;i<arr.length;i++)
        {
            maxx =Math.max(maxx,arr[i]);
        }

        return maxx;

    }
    public static void main(String[] args) {

    }

}
