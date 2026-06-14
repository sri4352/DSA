package Array.Day_1;
// Maximum element in an array
// GFG problem
public class c {
    int largest(int arr[]) {
        int n =arr.length;
        int maxx =Integer.MIN_VALUE;
        for (int i =0;i<n;i++)
        {
            if (arr[i]>maxx)maxx =arr[i];
        }
        return maxx;

    }

    public static void main(String[] args) {

    }

}
