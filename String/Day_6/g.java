package String.Day_6;
//Palindrome SubStrings Count(GFG practice)
public class g {
    public int match(String s,int i,int j)
    {
        int count =0;
        while (i>=0 && j<s.length() && s.charAt(i)==s.charAt(j))
        {
            if(i!=j)
            {
                count++;
            }
            i--;
            j++;
        }
        return count;
    }
    public int countPS(String s) {
        int n =s.length();
        int count =0;
        for (int center =0;center<n;center++)
        {
            count=count+match(s,center,center);
            count =count+match(s,center,center+1);
        }
        return count;
    }
    public static void main(String[] args) {

    }

}

