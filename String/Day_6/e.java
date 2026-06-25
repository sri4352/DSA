package String.Day_6;

import java.util.Arrays;

//Difference Check(GFG practice)
public class e {
    public int minDifference(String[] arr) {
        int n =arr.length;
        int [] ans =new int[n];
        for (int i =0;i<n;i++)
        {
            int hour =Integer.parseInt(arr[i].substring(0,2));
            int minute =Integer.parseInt(arr[i].substring(3,5));
            int second =Integer.parseInt(arr[i].substring(6,8));
            ans[i] =hour*3600+minute*60+second;
        }
        Arrays.sort(ans);
        int minn_diff =Integer.MAX_VALUE;
        for (int i =0;i<n-1;i++)
        {
            int diff =ans[i+1]-ans[i];
            minn_diff =Math.min(diff,minn_diff);
        }
        int last_diff =ans[0]+86400-ans[n-1];
        minn_diff =Math.min(last_diff,minn_diff);
        return minn_diff;
    }
    public static void main(String[] args) {

    }

}
