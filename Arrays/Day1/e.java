package Array.Day_1;
// Problem in GFG reverse an array
public class e {
    public void reverseArray(int arr[]) {
        int i =0;
        int j =arr.length-1;
        while (i<=j)
        {
            int temp =arr[i];
            arr[i] =arr[j];
            arr[j] =temp;
            i++;
            j--;
        }

    }
    public static void main(String[] args) {

    }

}
