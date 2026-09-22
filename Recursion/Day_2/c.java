package Recursion.Day_2;

public class c {
    public static int largest(int[] arr,int i,int max) {
        if (i>=arr.length)return max;
        if (arr[i]>max)
        {
            max =arr[i];
        }
        return largest(arr,i+1,max);
    }
    public static void main(String[] args) {
        int i =0;
        int [] arr =new int[10];
        int ans =Integer.MIN_VALUE;
         ans =largest(arr,i,ans);
    }

}
