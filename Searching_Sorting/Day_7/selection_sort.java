package Searching_Sorting.Day_7;

public class selection_sort {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    void selectionSort(int[] arr) {
        int n =arr.length;
        for (int i =0;i<n-1;i++)
        {
            int min_index =i;
            for (int j =i+1;j<n;j++)
            {
                if (arr[j]<arr[min_index])
                {
                    min_index =j;
                }
            }
            swap(arr,i,min_index);
        }
    }
    public static void main(String[] args) {

    }

}







