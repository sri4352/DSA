package Searching_Sorting.Day_2;
// Search in an almost Sorted Array
public class b {
    public int findTarget(int arr[], int target) {
        int i =0;
        int j =arr.length-1;
        while (i<=j)
        {
            int mid =i+(j-i)/2;
            if (arr[mid]==target)return mid;
            if ( mid>0 && arr[mid-1] ==target)return mid-1;
            if (mid<arr.length-1 && arr[mid+1]==target)return mid+1;
            else if (arr[mid]>target) {
                j =mid-2;
            }
            else i =mid+2;
        }
        return -1;
    }
    public static void main(String[] args) {

    }

}
