package BACKTRACKING;
public class BackTrackingOnArray {
    static void calculation(int i , int val , int arr[]){
        //base case
        if(i == arr.length){
            printArray(arr);
            System.out.println();
            return;
        }
        //recursion
        arr[i] = val;
        calculation(i + 1, val + 1, arr);
        
        //backtracking calculation
        arr[i] = arr[i] - 2;
        //what happens in this line of code, when we are going back down the call stack
        //we are manipulating the values stored in the array
        //we are able to do that because at each call stack there is a value for "i" in each call stack
        //which was given to it while we were building/going up the callstack recursively
    }

    static void printArray(int arr[]){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]);
            if( i < arr.length - 1){
                System.out.print(", ");
            }
        }
    }
    public static void main(String [] args){
        int arr[] = new int[5];
        calculation(0, 1, arr);
        System.out.println("Array after BackTracking is Completed");
        printArray(arr);
    }
}
