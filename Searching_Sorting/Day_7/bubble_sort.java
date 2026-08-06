package Searching_Sorting.Day_7;

public class bubble_sort {

    public void bubbleSort(int[] arr) {
        int n =arr.length;
        for (int i =0;i<n-1;i++)
        {
            boolean swap =false;
            for (int j =0;j<n-1-i;j++)
            {
                if (arr[j]>arr[j+1])
                {
                    swap =true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (!swap)return;
        }
    }
    public static void main(String[] args) {

    }

}

