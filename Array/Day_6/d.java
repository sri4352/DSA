package Array.Day_6;

import java.util.HashSet;

//Check if array contains duplicates(GFG practice)
public class d {
    public boolean checkDuplicates(int arr[]) {
        HashSet<Integer> set = new HashSet<>();

        for (int x : arr) {
            if (set.contains(x)) {
                return true;
            }
            set.add(x);
        }

        return false;
    }
    public static void main(String[] args) {

    }

}
