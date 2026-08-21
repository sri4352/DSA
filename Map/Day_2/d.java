
package Map.Day_2;

import java.util.HashMap;
// leetcode 2001
public class d {
    // approach 1
    public int gcd(int a,int b)
    {
        while (a!=0)
        {
            int temp =b%a;
            b =a;
            a =temp;
        }
        return b;
    }
    public long interchangeableRectangles(int[][] rectangles) {
        long result =0;
        int n =rectangles.length;
        HashMap<String,Integer> hashMap =new HashMap<>();
        for (int i =0;i<n;i++)
        {
           int height =rectangles[i][0];
           int width =rectangles[i][1];
           int gcd =gcd(height,width);
           height =height/gcd;
           width =width/gcd;
           String ratio =height+"/"+width;
           result =result+hashMap.getOrDefault(ratio,0);
           hashMap.put(ratio,hashMap.getOrDefault(ratio,0)+1);
        }
        return result;
    }
    // approach 2
    public long interchangeableRectangle(int[][] rectangles) {

        HashMap<Double, Integer> map = new HashMap<>();

        for (int[] rectangle : rectangles) {

            double ratio = (double) rectangle[0] / rectangle[1];

            map.put(ratio, map.getOrDefault(ratio, 0) + 1);
        }

        long result = 0;

        for (int count : map.values()) {

            if (count > 1) {
                result += (long) count * (count - 1) / 2;
            }
        }

        return result;
    }
}


