package Math;
import java.util.Arrays;

//count prime(leetcode 204)
public class a {
    public int countPrimes(int n)
    {
        if (n==0 || n==1 || n==2)return 0;
        boolean [] arr =new boolean[n];
        Arrays.fill(arr,true);
        arr[0] =false;
        arr[1] =false;
        int count =0;
        for (int i =2;i<n;i++)
        {
            if (arr[i]) {
                count++;
                if ((long)i * i < n) {
                    for (int j = i*i; j < n; j += i) {
                        arr[j] = false;
                    }
                }
            }
        } return count;
    }
    public static void main(String[] args) {

    }

}



