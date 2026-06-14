package Array.Day_3;
// wave print a matrix
public class g {
    public static void wavePrint(int[][] arr)
    {
        int m =arr.length;
        int n =arr[0].length;
        for (int i =0;i<n;i++)
        {
            if (i%2==0)
            {
                for (int j =0;j<m;j++)
                {
                    System.out.print(arr[j][i]+" ");
                }
                System.out.println();
            }
            else
            {
                for (int j=m-1;j>=0;j--)
                {
                    System.out.print(arr[j][i]+" ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int [][] arr ={{1,2,12,9},{5,4,10,15},{3,8,11,16}};
        wavePrint(arr);
    }

}
