package JusPay;
import java.util.Arrays;
public class LargestSumCycle2 {
    public long solution(int[] edge) {
        int n = edge.length;
        long maxCycleSum = -1;

        long[] pathSum = new long[n];

        int[] pathNode = new int[n];
        Arrays.fill(pathNode, -1);

        for (int i = 0; i < n; i++) {
            int curr = i;
            long currentSum = 0;
            while (curr != -1) {
                if (pathNode[curr] != -1) {
                    if (pathNode[curr] == i) {
                        long cycleSum = currentSum - pathSum[curr];
                        if (cycleSum > maxCycleSum) {
                            maxCycleSum = cycleSum;
                        }
                    }
                    break;
                }
                pathNode[curr] = i;
                pathSum[curr] = currentSum; // Store the sum BEFORE adding the current node
                currentSum += curr;         // Add current node to running total
                curr = edge[curr];
            }
        }
        return maxCycleSum;
    }
    public static void main(String[] args) {
        LargestSumCycle2 solver = new LargestSumCycle2();
        int[] edge1 = {1, 2, 0, 4, 3};
        System.out.println("Test Case 1 Result: " + solver.solution(edge1)); // Expected: 7
        int[] edge2 = {1, -1};
        System.out.println("Test Case 2 Result: " + solver.solution(edge2)); // Expected: -1
        int[] edge3 = {0, 1};
        System.out.println("Test Case 3 Result: " + solver.solution(edge3)); // Expected: 1
    }
}
