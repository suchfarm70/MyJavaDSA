package JusPay;
import java.util.*;
public class LargestSumCycle {
    public long solution(int[] edge) {
        int n = edge.length;
        long maxSum = -1;
        boolean[] visited = new boolean[n];
        boolean[] pathVisited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                long cycleSum = findCycle(i, edge, visited, pathVisited);
                if (cycleSum != -1) {
                    maxSum = Math.max(maxSum, cycleSum);
                }
            }
        }
        return maxSum;
    }

    private long findCycle(int startNode, int[] edge, boolean[] visited, boolean[] pathVisited) {
        int curr = startNode;

        while (curr != -1 && !visited[curr]) {
            visited[curr] = true;
            pathVisited[curr] = true;
            curr = edge[curr];
        }

        if (curr != -1 && pathVisited[curr]) {
            long currentCycleSum = 0;
            int temp = curr;
            // Traverse the cycle to calculate sum
            do {
                currentCycleSum += temp;
                temp = edge[temp];
            } while (temp != curr);

            return currentCycleSum;
        }
        return -1;
    }
    public static void main(String [] args){
        LargestSumCycle solver = new LargestSumCycle();
        int[] edge1 = {1, 2, 0, 4, 3};
        System.out.println("Test Case 1 Result: " + solver.solution(edge1)); // Expected: 7
        int[] edge2 = {1, -1};
        System.out.println("Test Case 2 Result: " + solver.solution(edge2)); // Expected: -1
        int[] edge3 = {0, 1};
        System.out.println("Test Case 3 Result: " + solver.solution(edge3)); // Expected: 1
    }
}