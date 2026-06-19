package Searching_Sorting.Day_5;

import java.util.Arrays;

// search in a sorted array || (leetcode 81) and gfg practice
public class a {
    public boolean search(int[] arr, int target) {
        int i =0;
        int j =arr.length-1;
        while (i<=j)
        {
            int mid =i+(j-i)/2;
            if (arr[mid]==target)return true;
            if (arr[i] == arr[mid] && arr[mid] == arr[j]) {
                i++;
                j--;
            }
            else if (arr[mid]>=arr[i]) {
                if (target>=arr[i] && target<=arr[mid])
                {
                    j =mid-1;
                }
                else i =mid+1;
            }
            else
            {
                if (target>=arr[mid] && target<=arr[j])
                {
                    i =mid+1;
                }
                else j =mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {

    }

}
