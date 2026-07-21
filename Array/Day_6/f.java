package Array.Day_6;
// town judge (leetcode 997)
public class f {
    public int findJudge(int n, int[][] trust) {
        int [] arr =new int[n+1];
        for (int i =0;i< trust.length;i++)
        {
            arr[trust[i][0]]--;
            arr[trust[i][1]]++;
        }
        for (int i =1;i<=n;i++)
        {
            if (arr[i]==n-1)return i;
        }
        return -1;
    }
    public int findJudges(int n, int[][] trust) {
        int [] in_arr =new int[n+1];
        int [] out_arr =new int[n+1];
        for (int i =0;i< trust.length;i++)
        {
            in_arr[trust[i][1]]++;
            out_arr[trust[i][0]]++;
        }
        for (int i =1;i<=n;i++)
        {
            if (in_arr[i]==n-1 && out_arr[i]==0)return i;
        }
        return -1;
    }
    public static void main(String[] args) {

    }

}
