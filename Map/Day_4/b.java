package Map.Day_4;

import java.util.HashMap;
import java.util.Map;

public class b {
    public int numRabbits(int[] answers) {
        int result =0;
        HashMap<Integer,Integer>map =new HashMap<>();
        for (int i =0;i<answers.length;i++)
        {
            map.put(answers[i],map.getOrDefault(answers[i],0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int x = entry.getKey();
            int count = entry.getValue();
            int group_size =x+1;
            int total_group = (int) Math.ceil((double) count/group_size);
            result+=total_group*group_size;
        }
        return result;
    }
}

