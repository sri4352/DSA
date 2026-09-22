package String.Day_9;

//add strings (leetcode 415)
// Sum Two Large Numbers(GFG practice)
public class f {
    public String addStrings(String num1, String num2) {
        StringBuilder ans =new StringBuilder();
        int i =num1.length()-1;
        int j =num2.length()-1;
        int carry =0;
       while (i>=0 && j>=0)
       {
           int a =num1.charAt(i)-'0';
           int b =num2.charAt(j)-'0';
           int sum =a+b+carry;
           int digit =sum%10;
           carry =sum/10;
           ans.append(digit);
           i--;
           j--;
       }
       while (i>=0)
       {
           int a =num1.charAt(i)-'0';
           int sum =a+carry;
           int digit =sum%10;
           carry =sum/10;
           ans.append(digit);
           i--;
       }
        while (j>=0)
        {
            int a =num2.charAt(j)-'0';
            int sum =a+carry;
            int digit =sum%10;
            carry =sum/10;
            ans.append(digit);
            j--;
        }
       if (carry!=0)ans.append(carry);
       StringBuilder answer = ans.reverse();
       int temp =0;
       while (answer.length()>1 && answer.charAt(temp)-'0'==0)
       {
           ans.deleteCharAt(temp);
           temp++;
       }
        return answer.toString();
    }
}

