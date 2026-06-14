package Array.Day_1;

import java.util.ArrayList;
// two sum in sorted array
// Leetcode 167
// Same Problem in GFG
public class h {

    // Leetcode solution
    public int[] twoSum(int[] arr, int target) {
        int[] ans = new int[2];
        int i = 0;
        int j = arr.length - 1;

        while (i <= j) {
            if (arr[i] + arr[j] == target) {
                ans[0] = i + 1;
                ans[1] = j + 1;
                return ans;
            } else if (arr[i] + arr[j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return ans;
    }

    // GFG solution
    public ArrayList<Integer> twoSumm(int[] arr, int target) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = arr.length - 1;

        while (i <= j) {
            if (arr[i] + arr[j] == target) {
                ans.add(i + 1);
                ans.add(j + 1);
                return ans;
            } else if (arr[i] + arr[j] > target) {
                j--;
            } else {
                i++;
            }
        }

        ans.add(-1);
        ans.add(-1);
        return ans;
    }

    public static void main(String[] args) {

    }
}

