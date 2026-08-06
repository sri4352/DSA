package Searching_Sorting.Day_7;

public class insertion_sort {
    public void insertionSort(int arr[]) {
        int n =arr.length;
        for (int i =1;i<n;i++)
        {
            int val =arr[i];
            int j =i-1;
            while (i>=0 &&  val<arr[j])
            {
                arr[j+1] =arr[j];
                j--;
            }
            arr[j+1] =val;
        }
    }
    public static void main(String[] args) {

    }

}
