package Map.Day_4;

import java.util.HashSet;
import java.util.Set;

// leetcode 898
public class d {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer> prev =new HashSet<>();
        Set<Integer> curr =new HashSet<>();
        Set<Integer> result =new HashSet<>();
        for (int i :arr)
        {
            result.add(i);
            curr.add(i);
            for (int x :prev)
            {
                result.add(i|x);
                curr.add(i | x);
            }
            prev =curr;
            curr =new HashSet<>();
        }
        return result.size();
    }
}

