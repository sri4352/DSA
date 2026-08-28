package Map.Day_4;

// leetcode 3120

public class h {
    public int numberOfSpecialChars(String word) {
        int[] arr =new int[52];
        for (int i =0;i<word.length();i++)
        {
            char ch =word.charAt(i);
            if (Character.isLowerCase(ch))
            {
                arr[ch-'a']++;
            }
            else arr[ch-'A'+26]++;
        }
        int count =0;
        for (int i =0;i<26;i++)
        {
            if (arr[i]>0 && arr[i+26]>0)count++;
        }
        return count;
    }
}

