package Recursion.Day_2;
// super pow(leetcdoe 372)
public class a{
    public int calc(int x ,int power)
    {
        if (power == 0)
            return 1;
        int temp = calc(x, power/ 2);
        long ans = (1L * temp * temp) % 1337;
        if (power % 2 == 1)
            ans = (ans * x) % 1337;
        return (int) ans;
    }
    public int superPow(int a, int[] b) {
        a =a%1337;
        int ans =1;
        for (int i =0;i<b.length;i++)
        {
            ans = (calc(ans,10) * calc(a,b[i])) % 1337;
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}




