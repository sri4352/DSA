package Recursion.Day_1;
//1 to n Without Loops(GFG practice)
public class c {
    public void printTillN(int n) {
        if (n==0)return;
        printTillN(n-1);
        System.out.print(n+" ");

    }
    public static void main(String[] args) {

    }

}
