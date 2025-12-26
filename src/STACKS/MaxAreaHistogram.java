package STACKS;
import java.util.*;
public class MaxAreaHistogram {
    public static void Area(int arr[]){
        int MaxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        //Next Smaller Right O(n)
        for(int i = arr.length -1 ; i >= 0 ; i--){
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            if(stack.isEmpty()){
                nsr[i] = arr.length;
            }
            else{
                nsr[i] = stack.peek();
            }
            stack.push(i);
        }

        //Next Smaller Left O(n)
        stack = new Stack<>();
        for(int i = 0 ; i < arr.length ; i++){
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            if(stack.isEmpty()){
                nsl[i] = -1;
            }
            else{
                nsl[i] = stack.peek();
            }
            stack.push(i);
        }
        //Current Area formula for width = j - i - 1 or nsr[i] - nsl[i] - 1
        for(int i = 0 ; i <  arr.length ; i++){
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int CurrArea = height * width;
            MaxArea = Math.max(MaxArea, CurrArea);
        }
        System.out.println("Maximum Area = "+ MaxArea);
    }
    public static void main(String [] args){
        int arr[] = {2 , 1 , 5 , 6, 2 , 3};
        Area(arr);
    }
}