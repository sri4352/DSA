package Map.Day_3;

import java.util.HashSet;
import java.util.List;

// replace word(leetcode 648)
public class a {
    public String check(String s,HashSet<String>dic)
    {
        int len =s.length();
        for (int i =1;i<=len;i++)
        {
            String substring =s.substring(0,i);
            if (dic.contains(substring))
            {
                return substring;
            }
        }
        return s;
    }
    public String replaceWords(List<String> dictionary, String sentence) {
        HashSet<String> stringHashSet =new HashSet<>(dictionary);
        StringBuilder result =new StringBuilder();
        String[] arr_string =sentence.split(" ");
        for (String s:arr_string)
        {
           result.append(check(s,stringHashSet)).append(" ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {

    }

}

