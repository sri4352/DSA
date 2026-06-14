package Array.Day_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Add array to form of integer (leetcode 989)
public class b {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans =new ArrayList<>();
        int i =num.length-1;
        int carry =0;
        while (k>0 && i>=0)
        {
            int last_digit =k%10;
            int sum =num[i]+last_digit+carry;
            if (sum>9)
            {
                carry =1;
                ans.add(sum%10);
            }
            else
            {
                ans.add(sum);
                carry =0;
            }
            k =k/10;
            i--;
        }
        while (k>0)
        {
            int last_digit =k%10;
            int sum =last_digit+carry;
            if (sum>9)
            {
                carry=1;
                ans.add(sum%10);
            }
            else
            {
                ans.add(sum);
                carry =0;
            }
            k =k/10;
        }
        while (i>=0)
        {
            int sum =num[i]+carry;
            if (sum>9)
            {
                ans.add(sum%10);
                carry =1;
            }
            else
            {
                ans.add(sum);
                carry =0;
            }
            i--;
        }
        if (carry==1)
        {
            ans.add(1);
        }
        Collections.reverse(ans);
        return ans;

    }
    public static void main(String[] args) {

    }

}
