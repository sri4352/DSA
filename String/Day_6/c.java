package String.Day_6;
//Remove all occurrences of a character in a string(GFG practice)
public class c {
    public void removeCharacter(StringBuilder s, char c) {
        int i  =0;
        while (i!=-1)
        {
            i =s.indexOf(String.valueOf(c));
          if (i!=-1)
          {
              s.deleteCharAt(i);
          }
        }
    }
    public static void main(String[] args) {

    }

}

