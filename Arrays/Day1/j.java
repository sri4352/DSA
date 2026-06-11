package Array.Day_1;
// Sort color (Leetcode 75)
// Sort 0 1 2 (On GFG)
public class j {
    public void sort012(int[] arr) {

        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;

                low++;
                mid++;
            }
            else if (arr[mid] == 1) {
                mid++;
            }
            else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                high--;
            }
        }
    }
    public static void main(String[] args) {

    }

}
