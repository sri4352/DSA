package Array.Day_1;
// Alternates in an Array
// GFG Problem
import java.util.ArrayList;

public class d {
    public ArrayList<Integer> getAlternates(int arr[]) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i =0;i<arr.length-1;i=i+2)
        {
            a.add(arr[i]);
        }
        return a;
    }
    public static void main(String[] args) {

    }

}

