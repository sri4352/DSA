package Recursion.Day_1;
//Print n to 1 without loop(GFG practice)
public class b {
    void printNos(int n) {
        if (n==0)return;
        System.out.print(n+" ");
        printNos(n-1);
    }
    public static void main(String[] args) {

    }

}
