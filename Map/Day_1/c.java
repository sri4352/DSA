package Map.Day_1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

//unique no of occurrences(leetcode 1207)
public class c {
    // approach 1
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hashMap =new HashMap<>();
        for (int i:arr)
        {
            hashMap.put(i,hashMap.getOrDefault(i,0)+1);
        }
        HashSet<Integer> hashSet =new HashSet<>();
        for (int freq: hashMap.values())
        {
            if (hashSet.contains(freq))
                return false;
            hashSet.add(freq);
        }
        return true;
    }
    // approach 2
    public boolean uniqueOccurrence(int[] arr) {
        int [] freq_arr =new int[2001];
        for (int i :arr)
        {
            freq_arr[i+1000]++;
        }
        Arrays.sort(freq_arr);
        for (int i =0;i<2000;i++)
        {
            if (freq_arr[i]==0)continue;
            if (freq_arr[i]==freq_arr[i+1])return false;
        }
        return true;
    }
    // approach 3
    public boolean uniqueOccurrencess(int[] arr) {
        int [] freq_arr =new int[2001];
        for (int i :arr)
        {
            freq_arr[i+1000]++;
        }
        for (int i =0;i<2001;i++)
        {
            if (freq_arr[i]==0)continue;
            int idx =Math.abs(freq_arr[i]);
            if (freq_arr[idx]<0)
            {
                return false;
            }
             freq_arr[idx] =-1;
        }
        return true;
    }
    public static void main(String[] args) {

    }


}
