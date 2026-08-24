package Map.Day_3;
import java.util.HashMap;

//find the no of distinct colors among the ball(leetcode 3160)
public class f {
    public int[] queryResults(int limit, int[][] queries{
        HashMap<Integer,Integer> color_count =new HashMap<>();
        HashMap<Integer,Integer> ball_color =new HashMap<>();
        int n = queries.length;
        int [] result =new int[n];
        for (int i =0;i<n;i++)
        {
            int ball =queries[i][0];
            int color =queries[i][1];
            if (ball_color.containsKey(ball))
            {
                color_count.put(ball_color.get(ball),color_count.get(ball_color.get(ball))-1);
                if (color_count.get(ball_color.get(ball))==0)
                    color_count.remove(ball_color.get(ball));
            }
            ball_color.put(ball,color);
           color_count.put(color,color_count.getOrDefault(color,0)+1);
           result[i] =color_count.size();
        }
        return result;
    }

}
