package Recursion.Day_4;
// Last index of a character(GFG practice)
public class a {
    // method 1
    int LastIndex(String s, char c) {
    int idx =-1;
    for (int i =s.length()-1;i>=0;i--)
    {
        if (s.charAt(i)==c)return i;
    }
    return idx;
    }

    // method 2
    int Last_index(String s, char c) {
        int n =s.length();
        return last_index_recursively(s,c,n-1);
    }
    int last_index_recursively(String s ,char c,int i)
    {
        int idx =-1;
        if (i<0)return idx;
        if (s.charAt(i)==c)
        {
            idx =i;
            return idx;
        }
        return last_index_recursively(s,c,i-1);
    }
}
