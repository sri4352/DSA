package Recursion.Day_1;
//Power Of Numbers(GFG practice)
public class g {
    public int reverseInt(int n)
    {
        int ans =0;
        while (n>0)
        {
            int remain =n%10;
            ans =ans*10+remain;
            n=n/10;
        }
        return ans;
    }
    public int calc(int x,int power)
    {
        if (power == 0)
            return 1;
        int temp = calc(x, power/ 2);
        if (power % 2 == 0)
            return temp * temp;
        else
            return x * temp * temp;
    }
    public int reverseExponentiation(int n) {
        int power =reverseInt(n);
        return calc(n,power);
    }
    public static void main(String[] args) {

    }

}
