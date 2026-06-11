package Array.Day_1;
// Segregate 0s and 1s (GFG Problem)
public class i {
    void segregate0and1(int[] arr) {
        int i =0;
        int start =0;
        int end =arr.length-1;
        while (i<=end)
        {
            if (arr[i] ==0)
            {
                int temp =arr[i];
                arr[i] =arr[start];
                arr[start] =temp;
                i++;
                start++;
            }
            else
            {
                int temp =arr[i];
                arr[i] =arr[end];
                arr[end] =temp;
              end--;
            }
        }
    }
    public static void main(String[] args) {

    }

}
