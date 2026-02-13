package TYFSlidingWindowandTwoPointerQuestions.MaxPointFromLeftandRight;
import java.util.*;
public class maxpointsfromleftandright {

    public static int ponitscalculation(int arr[] , int len , int size){
        int maxsum = 0;
        //initializing the sum with al the elements from the left
        for(int i = 0 ; i < size ; i++){
            maxsum += arr[i];
        }
        int sum = maxsum;
        size = size - 1;
        while (size >= 0) {
            //removal of element from the left
            sum = sum - arr[size];
            //addition of elemenst from the right
            sum = sum + arr[len - 1];
            len--;

            size--;//this decrement is part of the loop

            maxsum = Math.max(maxsum, sum);
        }
        return maxsum;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = { 6 , 12 , 13 , 2 , 8 , 3 , 13 , 5};
        int len = arr.length;
        System.out.println("Enter the size of the window");
        System.out.println("The size of the window should be less than 8");
        int size = sc.nextInt();

        System.out.println("Maximum possible sum from the given array = "+ponitscalculation(arr, len, size));
    }
}
