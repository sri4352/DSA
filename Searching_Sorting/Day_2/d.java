package Searching_Sorting.Day_2;
//Find Kth Rotation(GFG practice)
public class d {
    public int findKRotation(int arr[]) {
        int i =0;
        int j =arr.length-1;
        while (i<j)
        {
            int mid =i+(j-i)/2;
            if (arr[mid]<arr[j])j =mid;
            else i =mid+1;
        }
        return i;
    }
    public static void main(String[] args) {

    }

}

