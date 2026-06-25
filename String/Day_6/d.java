package String.Day_6;
// minimum time difference (leetcode 539)

import java.util.Arrays;
import java.util.List;

public class d {
    public int findMinDifference(List<String> timePoints) {
        int n =timePoints.size();
        int [] arr =new int[n];
        for (int i =0;i<n;i++)
        {
            int hour =Integer.parseInt(timePoints.get(i).substring(0,2));
            int minute =Integer.parseInt(timePoints.get(i).substring(3,5));
            arr[i] =hour*60+minute;
        }
        Arrays.sort(arr);
        int minn_diff =Integer.MAX_VALUE;
        for (int i=0;i<n-1;i++)
        {
            int diff =arr[i+1]-arr[i];
            minn_diff =Math.min(diff,minn_diff);
        }
        int last_diff =arr[0]+1440-arr[n-1];
        minn_diff =Math.min(minn_diff,last_diff);
        return minn_diff;
    }
    public static void main(String[] args) {

    }

}
