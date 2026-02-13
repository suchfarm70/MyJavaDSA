/* The Question for this code is
Find the subarray with the sum being as close as to the give value

    Subarray sum <= given value
 */
package TYFSlidingWindowandTwoPointerQuestions;
import java.util.*;
public class DynamicSlidingWindow {
    public static void DSW(int arr[] , int lenght , int K){
        int sum = 0;
        int maxsum = 0;
        int l = 0 , r = 0;
        int beststart = 0;
        int bestlenght = 0;
        while (r < lenght) {
            sum = sum + arr[r];
            while (sum > K) {
                sum = sum - arr[l];
                l = l + 1;
            }
            //maxsum = Math.max(maxsum, sum);
            // in place of the max function we are using a if condition
            if (sum > maxsum) {
                maxsum = sum;
                beststart = l;
                bestlenght = r - l + 1; 
            }
            r = r + 1;
        }
        System.out.println("Maximum sum closest to K = "+maxsum);
        System.out.println("From the starting Index of = "+beststart);
        System.out.println("With the lenght of "+ bestlenght);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter values into the array");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter desired Sum ");
        int K = sc.nextInt();
        DSW(arr, n, K);
    }
}