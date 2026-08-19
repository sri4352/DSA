package Map.Day_2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.TreeSet;

// smallest no. in a infinite set(leetcode 2336)
public class b {
    // approach 1
    class SmallestInfiniteSet {
        Boolean [] arr;
        int i;
        public SmallestInfiniteSet() {
            arr =new Boolean[1001];
            Arrays.fill(arr,true);
            i =1;
        }
        public int popSmallest() {
            int result =i;
            arr[i] =false;
            while (i<1001 &&arr[i]!=true)i++;
            return result;
        }
        public void addBack(int num) {
            arr[num] =true;
            if (num<i)
            {
                i =num;
            }
        }
    }
    // approach 2
    class SmallestInfiniteSet2 {
        HashSet<Integer> set;
        PriorityQueue<Integer> priorityQueue;
        int current_smallest;
        public SmallestInfiniteSet2() {
          set =new HashSet<>();
          priorityQueue =new PriorityQueue<>();
         current_smallest =1;
        }
        public int popSmallest() {
            int result = 0;
            if (!priorityQueue.isEmpty())
            {
                result =priorityQueue.poll();
                set.remove(result);
            }
            else
            {
                result= current_smallest;
                current_smallest++;
            }
            return result;
        }
        public void addBack(int num) {
            if (num>current_smallest || set.contains(num))
            {
                return;
            }
            set.add(num);
            priorityQueue.add(num);
        }
    }
    // approach 3
    class SmallestInfiniteSet3 {
        TreeSet<Integer>ordered_set;
        int current_smallest;
        public SmallestInfiniteSet3() {
           ordered_set =new TreeSet<>();
            current_smallest =1;
        }
        public int popSmallest() {
            int result;
            if (!ordered_set.isEmpty())
            {
                result =ordered_set.pollFirst();
            }
            else
            {
                result= current_smallest;
                current_smallest++;
            }
            return result;
        }
        public void addBack(int num) {
            if (num>=current_smallest || ordered_set.contains(num))
            {
                return;
            }
            ordered_set.add(num);
        }
    }

    public static void main(String[] args) {

    }

}

