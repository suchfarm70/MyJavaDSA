//FIXME THIS is BRUTE FORCE APPRAOCH FOR SOLVING THIS QUESTION
package TYFSlidingWindowandTwoPointerQuestions;
import java.util.*;
public class SimpleWindowofSizeK {
    static class Info {
        int max = 0;
        int pos = 0;

        Info(int max , int pos){
            this.max = max;
            this.pos = pos;
        }
    }

    public static Info windowsum(int arr[] , int N , int K){
        int max = 0;
        int pos = 0;
        for(int i = 0 ; i <= N - K; i++){
            int sum = 0;
            for(int j = i ; j < i + K ; j++){
                sum += arr[j];
            }
            if (sum > max) {
                max = sum;
                pos = i;
            }
        }
        Info info = new Info(max, pos);
        return info;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N;
        int K;
        System.out.println("Enter size of array");
        N = sc.nextInt();
        int arr[] = new int[N];
        System.out.println("Enter value into the array");
        for(int i = 0 ; i < N ; i++){
            arr[i] =sc.nextInt();
        }
        System.out.println("Enter size of window");
        K = sc.nextInt();
        if (K > N) {
            System.out.println("Invalid Window Size");
            return;            
        }

        Info result = windowsum(arr, N, K);
        System.out.println("Maximum Sum = "+ result.max+ " \n Index of Maximum Sum = " + result.pos);
    }
}
