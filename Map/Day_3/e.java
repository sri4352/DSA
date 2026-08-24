package Map.Day_3;
// check if array pairs divisible by k (leetcode 1497)
public class e {
    public boolean canArrange(int[] arr, int k) {
        int [] remainder_freq =new int[k];
        for (int num : arr) {
            int rem = (num % k + k) % k;
            remainder_freq[rem]++;
        }
        if (remainder_freq[0]%2!=0)return false;
        for (int i =1;i<=k/2;i++)
        {
            int check =k-1;
            if (remainder_freq[check]!=remainder_freq[i])
                return false;
        }
        return true;
    }
}

