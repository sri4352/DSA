package Array.Day_7;
// can place flowers(leetcode 605)
public class c {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n==0) return true;
        int len =flowerbed.length;
        for (int i =0;i<len;i++)
        {
            if (flowerbed[i]==0)
            {
                boolean left_side =i==0 || flowerbed[i-1]==0;
                boolean right_side =i==len-1 || flowerbed[i+1]==0;
                if (left_side && right_side)
                {
                    flowerbed[i]=1;
                    n--;
                }
                if (n==0)return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {

    }

}
