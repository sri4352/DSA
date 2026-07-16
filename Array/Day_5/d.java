package Array.Day_5;
//Next Permutation(leetcode 31 and GFG practice)
public class d {
    public void reverseArray(int [] arr,int i,int j)
    {
        while (i<j)
        {
            int temp =arr[i];
            arr[i] =arr[j];
            arr[j] =temp;
            i++;
            j--;
        }
    }

    void nextPermutation(int[] arr) {
        int n =arr.length;
        int pivot =-1;
        for (int i =n-1;i>0 ;i--)
        {
            if (arr[i-1]<arr[i])
            {
                pivot =i-1;
                break;
            }
        }
        if (pivot==-1)
        {
            reverseArray(arr,0,n-1);
            return;
        }
        for (int i =n-1;i>pivot;i--)
        {
            if (arr[i]>arr[pivot])
            {
                int temp =arr[i];
                arr[i] =arr[pivot];
                arr[pivot] =temp;
                break;
            }
        }
        reverseArray(arr,pivot+1,n-1);
        return;
    }
    public static void main(String[] args) {

    }

}

