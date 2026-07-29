package Stack.Day_1;
import java.util.Stack;
// online stock span(leetcode 901)
class StockSpanner {
    Stack<int[]> st =new Stack<>();
    public StockSpanner() {
    }
    public int next(int price) {
        int span =1;
        while (!st.isEmpty() && st.peek()[0]<=price)
        {
            span =span+st.peek()[1];
            st.pop();
        }
        st.push(new int[]{price,span});
        return span;
    }
}
public class b {
    public static void main(String[] args) {
        StockSpanner stockSpanner =new StockSpanner();
    }
}
