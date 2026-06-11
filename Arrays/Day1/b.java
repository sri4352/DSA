package Array.Day_1;
// Count zero in an array
// GFG problem
public class b {
    int countZeroes(int arr[], int n) {
        int no_of_zero =0;
        for (int i =0;i<n;i++)
        {
            if (arr[i]==0)no_of_zero++;
        }
        return no_of_zero;
    }
    public static void main(String[] args) {

    }

}
