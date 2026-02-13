package CPAssignment;
import java.lang.Math;
import java.util.Scanner;
public class Question02 {
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }

        // Initialize minPrice to the maximum possible integer value
        int minPrice = Integer.MAX_VALUE;
        // Initialize maxProfit to 0, since profit cannot be negative
        int maxProfit = 0;

        // The optimal solution is a single pass (O(n) time)
        for (int price : prices) {
            // 1. Track the lowest price seen so far (potential buy day)
            minPrice = Math.min(minPrice, price);

            // 2. Calculate the potential profit if selling today: (Current Price - Lowest Buy Price)
            int currentProfit = price - minPrice;

            // 3. Update the overall maximum profit.
            maxProfit = Math.max(maxProfit, currentProfit);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i = 0 ; i < x ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(maxProfit(arr));
    }
}