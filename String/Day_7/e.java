package String.Day_7;
//isomorphic string(leetcode 205 and GFG practice)
public class e {
    public boolean isIsomorphic(String s, String t) {
        int n =s.length();
        int [] arr =new int[256];
        boolean [] b_array =new boolean[256];
        for (int i =0;i<n;i++)
        {
           if (arr[s.charAt(i)]==0)
           {
               if (b_array[t.charAt(i)])
               {
                   return false;
               }
               arr[s.charAt(i)]=t.charAt(i);
               b_array[t.charAt(i)]=true;
           }
           else
           {
               if (arr[s.charAt(i)]!=t.charAt(i))
               {
                   return false;
               }
           }
        }
        return true;
    }
    public static void main(String[] args) {

    }

}

