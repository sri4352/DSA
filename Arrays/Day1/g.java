package Array.Day_1;
//Unique Number I  (GFG problem)
public class g {
    public int findUnique(int[] arr) {
        int ans=0;
        for (int i =0;i<arr.length;i++)
        {
            ans =ans^arr[i];
        }
        return ans;

    }
    public static void main(String[] args) {

    }

}
