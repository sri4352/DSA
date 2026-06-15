package Searching_Sorting.Day_1;
//Peak element(GFG solution)
// leetcode 162
public class c {
    public int peakElement(int[] arr) {
        int n =arr.length;
        if (n==1)return 0;
        if (arr[0]>arr[1])return 0;
        if (arr[n-2]<arr[n-1])return n-1;
        int i=1;
        int j =arr.length-2;
        while (i<=j)
        {
            int mid =i+(j-i)/2;
            if (arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1])return mid;
            else if (arr[mid]>arr[mid-1]) {
                i =mid+1;

            }
            else j =mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {

    }

}


