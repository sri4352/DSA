package Array.Day_1;
import java.util.Arrays;


public class basic {
    static void sum(int [] a)
    {
        int sum=0;
        for (int i:a)
        {
            sum+=i;
        }
        System.out.println("sum of array is :"+sum);

    }
    public static void main(String[] args) {
        int [] arr ={21,24,22,47};
        System.out.println(arr[2]);
        arr[3] =20;
        sum(arr);
        Arrays.sort(arr);
        for (int i:arr)
        {
            System.out.print(i+" ");
        }

    }

}
