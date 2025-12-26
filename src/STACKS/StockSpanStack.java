package STACKS;
import java.util.*;
public class StockSpanStack {

    static void stockspan(int stocks[] , int span[]){
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (int i = 1; i < stocks.length; i++) {
            int currPrice = stocks[i];
            while (!stack.isEmpty() && currPrice >= stocks[stack.peek()]) {
                stack.pop();
            }

            if(stack.isEmpty()){
                span[i] = i + 1;
            }
            else{
                int prevHigh = stack.peek();
                span[i] = i - prevHigh;
            }

            stack.push(i);
        }
    }
    public static void main(String [] args){
        int stocks[] = {100 , 80 , 60 , 70 , 60 , 85 , 100};
        int span[] = new int[stocks.length];
        span[0] = 1;
        
        stockspan(stocks, span);
        for(int i = 0 ; i < span.length ; i++){
            System.out.print(span[i]+" ");
        }
        System.out.println();
    }
}
