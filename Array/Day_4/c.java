package Array.Day_4;
//Sum of two numbers represented as arrays (GFG practice)
public class c {
    String calc_Sum(int arr1[], int arr2[]) {
        StringBuilder sb =new StringBuilder();
        int i =arr1.length-1;
        int j = arr2.length-1;
        int carry =0;
        while (i>=0 && j>=0)
        {
            int sum =arr1[i]+arr2[j]+carry;
            carry =sum/10;
            sb.append(sum%10);
            i--;
            j--;
        }
        while (i>=0)
        {
            int sum =arr1[i]+carry;
            carry =sum/10;
            sb.append(sum%10);
            i--;
        }
        while (j>=0)
        {
            int sum =arr2[j]+carry;
            carry =sum/10;
            sb.append(sum%10);
            j--;
        }
        if (carry>0)
        {
            sb.append(1);
        }
        sb.reverse();
        String ans =sb.toString();
        return ans;
    }
    public static void main(String[] args) {

    }

}


