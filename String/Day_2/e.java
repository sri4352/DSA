package String.Day_2;
// to lowercase (leetcode 709)
public class e {
    public String toLowerCase(String s) {
        char [] arr =s.toCharArray();
        for (int i =0;i<arr.length;i++)
        {
            if (arr[i]>='A' && arr[i]<='Z')
            {
                arr[i] = (char) (arr[i]+32);
            }
        }
        String ans =new String(arr);
        return ans;
    }
    public static void main(String[] args) {

    }

}
