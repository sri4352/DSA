package String.Day_9;
// integer to roman(leetcode 12 and GFG practice)
public class b {
    public String intToRoman(int num) {
        int [] value ={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String [] roman ={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder ans =new StringBuilder();
        int i =0;
        while (num>0)
        {
            if(num>=value[i])
            {
                ans.append(roman[i]);
                num =num-value[i];
            }
            else i++;
        }
        return ans.toString();
    }
    public static void main(String[] args) {

    }

}
