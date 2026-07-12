package Searching_Sorting.Day_3;

public class f {
    // first approach
    public int findKthPositive(int[] arr, int k) {
        int num =1;
        int n =arr.length;
        int i =0;
        while (i<n && k>0)
        {
            if (arr[i]==num)
            {
                i++;
            }
            else {
                k--;
            }
            num++;
        }
       while (k!=0)
       {
           num++;
           k--;
       }
        return num-1;
    }

    // second approach
    public int findKthPositivee(int[] arr, int k) {
       int i =0;
       int j =arr.length-1;
       while (i<=j)
       {
           int mid =i+(j-i)/2;
           int no_of_missing =arr[mid]-(mid+1);
           if (no_of_missing<k)
           {
               i =mid+1;
           }
           else j =mid-1;
       }
       return i+k;
    }

    public static void main(String[] args) {

    }

}

