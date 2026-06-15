package Searching_Sorting.Day_1;
// linear search (GFG practice)
public class linear_search {
    public int search(int arr[], int x) {
        for (int i =0;i<arr.length;i++)
        {
            if (arr[i]==x)return i;
        }
        return -1;
    }
    public static void main(String[] args) {

    }

}
