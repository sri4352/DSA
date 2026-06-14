package Array.Day_4;

import java.util.ArrayList;
import java.util.Collections;

// Factorial of largest number(GFG practice)
public class d {
    public ArrayList<Integer> factorial(int n) {
        ArrayList<Integer> ans =new ArrayList<>();
        ans.add(1);
        for (int i =2;i<=n;i++)
        {
            int carry =0;
            for (int j =0;j<ans.size();j++)
            {
                int x =ans.get(j)*i+carry;
                ans.set(j,x%10);
                carry =x/10;
            }
            while (carry>0)
            {
                ans.add(carry%10);
                carry/=10;
            }
        }
        Collections.reverse(ans);
        return ans;
    }
    public static void main(String[] args) {

    }

}
