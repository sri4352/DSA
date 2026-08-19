package Searching_Sorting.Day_6;
//Smallest Missing Number(GFG practice)
public class f {

    public int findFirstMissing(int[] arr) {
        int i =0;
        int j =arr.length-1;
        while (i<=j)
        {
            int mid =i+(j-i)/2;
            if (arr[mid]==mid)i =mid+1;
            else j =mid-1;
        }
        return i;
    }
}
