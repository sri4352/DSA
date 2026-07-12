package Searching_Sorting.Day_4;
//koko eating bananas(leetcode 875)
import java.util.Arrays;
public class d {
    public boolean ifPossible(int [] arr,int possibleHour,int actualHour)
    {
        int timeTaken =0;
        for (int i:arr)
        {
            timeTaken=timeTaken+i/possibleHour;
            if (i%possibleHour!=0)timeTaken++;
        }
        return timeTaken<=actualHour;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int i =1;
        int j = Arrays.stream(piles).max().getAsInt();
        while (i<j)
        {
            int mid =i+(j-i)/2;
            if(ifPossible(piles,mid,h))
            {
                j =mid;
            }
            else i =mid+1;
        }
        return i;
    }
    static void main() {

    }
}
