package Searching_Sorting.Day_3;
// guess no (leetcode 374)
public class e {
    public int guess(int n)
    {
        return -1;
    } // just for no error no use of this code
       public int guessNumber(int n) {
        int i =1;
        int j =n;
        while (i<=j)
        {
            int guess_no =i+(j-i)/2;
            int result =guess(guess_no);
            if (result==0)return guess_no;
            else if (result==-1) {
                j =guess_no-1;
            }
            else i =guess_no+1;
        }
        return -1;
    }
    public static void main(String[] args) {

    }

}
