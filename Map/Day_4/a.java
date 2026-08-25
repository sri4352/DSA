package Map.Day_4;
// total character in string after transformation(leetcode 3335)
public class a {
    public int lengthAfterTransformations(String s, int t) {
        int [] freq_arr =new int[26];
        int n =s.length();
        final int M = 1_000_000_007;
        for (int i =0;i<n;i++)
        {
            freq_arr[s.charAt(i)-'a']++;
        }
        for (int trans =1;trans<=t;trans++)
        {
            int [] temp =new int[26];
            for (int i =0;i<26;i++)
            {
                char ch =(char) (i+'a');
                int freq =freq_arr[i];
                if (ch!='z')
                {
                    temp[i+1] =(temp[i+1]+freq)%M;
                }
                else
                {
                    temp[0] =(temp[0]+freq)%M;
                    temp[1] =(temp[1]+freq)%M;
                }
            }
            freq_arr =temp;
        }
        int result =0;
        for (int i =0;i<26;i++)
        {
            if (freq_arr[i]==0)continue;
            result =result+freq_arr[i];
        }
        return result;
    }
}
