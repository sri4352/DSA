package Sliding_window.Day_1;

// count occurences of anagram(GFG practice)
public class a {
    public boolean check_all_zero(int [] arr)
    {
        for (int i :arr)
        {
            if (i!=0)return false;
        }
        return true;
    }
    public int search(String pat, String txt) {
        int n =pat.length();
        int len =txt.length();
        int [] arr =new int[26];
        for (int i =0;i<n;i++)
        {
            arr[pat.charAt(i)-'a']++;
        }
        int i =0;
        int j =0;
        int result =0;
        while (j<len)
        {
            arr[txt.charAt(j)-'a']--;
            if (j-i+1==n)
            {
                if (check_all_zero(arr))
                {
                    result++;
                }
                arr[txt.charAt(i)-'a']++;
                i++;
            }
            j++;
        }
        return result;
    }
}


