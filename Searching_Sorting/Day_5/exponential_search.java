package Searching_Sorting.Day_5;

import java.util.Arrays;

public class exponential_search {
    public static int exponentialSearch(int [] arr, int x)
    {
        int n =arr.length;
        if (arr[0]==x)return 0;
        int i =1;
        while (i<n && arr[i]<=x)
        {
            i = i*2;
        }
        int ans = Arrays.binarySearch(arr, i / 2 , Math.min(i, n), x);
        return ans;
    }
    public static void main(String[] args) {
        int [] arr ={3,5,9,12,18,21,25,26,28,30};
        System.out.println(exponentialSearch(arr,28));
    }
}
