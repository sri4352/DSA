package String.Day_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// largest number(leetcode 179)
public class f {
    public String largestNumber(int[] nums) {
        Comparator<String> cmp =new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
               String a =o1+o2;
               String b =o2+o1;
                return b.compareTo(a);
            }
        };
        ArrayList<String> stringArrayList =new ArrayList<>();
        StringBuilder ans =new StringBuilder();
        for (int i =0;i<nums.length;i++)
        {
            stringArrayList.add(String.valueOf(nums[i]));
        }
        Collections.sort(stringArrayList,cmp);
        if (stringArrayList.get(0).equals("0"))
        {
            return "0";
        }
        for (int i=0;i<stringArrayList.size();i++)
        {
            ans.append(stringArrayList.get(i));
        }
        return ans.toString();
    }
    public static void main(String[] args) {

    }

}
