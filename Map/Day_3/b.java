package Map.Day_3;

import java.util.Arrays;
import java.util.TreeMap;

//hand of straights(leetcode 846)
public class b {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n =hand.length;
        if (n%groupSize!=0)return false;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i:hand)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        while (!map.isEmpty())
        {
            int current_element =map.firstKey();
            for (int i =0;i<groupSize;i++)
            {
              if (!map.containsKey(current_element+i))return false;
              map.put(current_element+i,map.get(current_element+i)-1);
                if (map.get(current_element+i)==0)
                {
                    map.remove(current_element+i);
                }
            }
        }
        return true;
    }
}

