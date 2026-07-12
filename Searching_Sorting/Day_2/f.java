package Searching_Sorting.Day_2;
//Search in Rotated Array 2(GFG practice)
public class f {
    public  static int findPivot(int [] arr,int i,int j)
    {
        while (i<j)
        {
            while (i<j && arr[i]==arr[i+1])
            {
                i++;
            }
            while (i<j && arr[j]==arr[j-1])
            {
                j--;
            }
            int mid =i+(j-i)/2;
            if (arr[mid]>arr[j])
            {
                i =mid+1;
            }
            else j =mid;
        }
        return j;
    }
    public static boolean binarySearch(int [] arr,int i,int j,int target)
    {
        while (i<=j)
        {
            int mid =i+(j-i)/2;
            if (arr[mid]==target)return true;
            else if (arr[mid]>target) {
                j =mid-1;

            }
            else i =mid+1;
        }
        return false;
    }
    public boolean search(int[] arr, int key) {
        int i =0;
        int j =arr.length-1;
        int pivot =findPivot(arr,i,j);
        boolean find =binarySearch(arr,0,pivot-1,key);
        if (find)
        {
            return true;
        }
        else return binarySearch(arr,pivot,arr.length-1,key);
    }

    public static void main(String[] args) {

    }

}
