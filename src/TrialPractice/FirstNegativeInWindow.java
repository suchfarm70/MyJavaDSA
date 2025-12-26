package TrialPractice;
import java.util.*;

public class FirstNegativeInWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input N and K
        int N = sc.nextInt();
        int K = sc.nextInt();

        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // For each window of size K
        for (int i = 0; i <= N - K; i++) {
            int firstNegative = 0; // default 0 if no negative found
            for (int j = i; j < i + K; j++) {
                if (arr[j] < 0) {
                    firstNegative = arr[j];
                    break; // stop at first negative
                }
            }
            System.out.print(firstNegative + " ");
        }
    }
}
