package Array.Day_3;

import java.util.ArrayList;

// Common in 3 Sorted Arrays (GFG practice)
// also available in Leetcode premium
public class e {
    public ArrayList<Integer> commonElements(int[] a, int[] b, int[] c) {
        ArrayList<Integer> ans =new ArrayList<>();
        int i =0;
        int j =0;
        int k =0;
        while (i<a.length && j<b.length && k<c.length)
        {
            if (a[i]==b[j] && a[i]==c[k])
            {
                if (ans.isEmpty() || ans.get(ans.size()-1)!=a[i])
                {
                    ans.add(a[i]);
                }
                i++;
                j++;
                k++;
            } else if (a[i]<b[j]) {
                i++;
            } else if (b[j]<c[k]) {
                j++;
            }
            else k++;
        }
        return ans;
    }
    public static void main(String[] args) {

    }

}
