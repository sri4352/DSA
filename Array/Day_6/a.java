package Array.Day_6;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

// find original array from doubled array(leetcode 2007)
public class a {
    public int[] findOriginalArray(int[] changed) {
        int n =changed.length;
        if (n%2!=0)return new int[0];
        ArrayList<Integer> abstractList =new ArrayList<>();
        HashMap<Integer,Integer>frequencyMap =new HashMap<>();
        Arrays.sort(changed);
        for (int i:changed)
        {
            frequencyMap.put(i,frequencyMap.getOrDefault(i,0)+1);
        }
        for (int i:changed)
        {
            if (frequencyMap.get(i)==0)continue;
            if (!frequencyMap.containsKey(2*i) || frequencyMap.get(2*i)<=0)
            {
                return new int[0];
            }
            else
            {
                abstractList.add(i);
               frequencyMap.put(i,frequencyMap.get(i)-1);
                frequencyMap.put(2*i,frequencyMap.get(2*i)-1);
            }
        }
        int[] arr = new int[abstractList.size()];

        for (int i = 0; i < abstractList.size(); i++) {
            arr[i] = abstractList.get(i);
        }
        return arr;
    }
    public static void main(String[] args) {

    }

}

