// Time Complexity is O(N + N)

//FIXME CHECK FILE "bettercomplexity.java"
package TYFSlidingWindowandTwoPointerQuestions;
import java.util.*;
public class LongestSubarraywithsumlessthanequaltoK {
    public static void longestsubarray(int arr[] , int K , int len){
        int l = 0;
        int r = 0;
        int maxi = 0;
        int maxlen = 0;
        int currsum = 0;
        while (r < len) {
            currsum = currsum + arr[r];

            while (currsum > K) {
                currsum = currsum - arr[l];
                l++;
            }

            if (currsum <= K) {
                int currlen = r - l + 1;
                if (currlen > maxlen) {
                    maxlen = currlen;
                    maxi = l;
                }
            }
            r = r + 1;
        }
        System.out.println("Maximum lenght of subarray with sum <= K = "+ maxlen);
        System.out.println("At the Index of "+ maxi);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter values into the array");
        for(int i = 0 ; i < n ;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of K");
        int K = sc.nextInt();
        longestsubarray(arr, K, n);
    }
}