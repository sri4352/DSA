package Searching_Sorting.Day_4;

import java.util.Arrays;

//minimum time to complete trips(leetcode 2187)
public class c {
    public boolean ifPossible(int [] arr,long given_time,int trips_time)
    {
        long total_time_taken =0;
        for (int i:arr)
        {
            total_time_taken =total_time_taken+given_time/i;
        }
        return total_time_taken>=trips_time;
    }
    public long minimumTime(int[] time, int totalTrips) {
        long i =0;
        long j =(long)(Arrays.stream(time).min().getAsInt())*totalTrips;
        while (i<j)
        {
            long mid =i+(j-i)/2;
            if (ifPossible(time,mid,totalTrips))
            {
                j =mid;
            }
            else i =mid+1;
        }
        return i;

    }
    public static void main(String[] args) {

    }
}



