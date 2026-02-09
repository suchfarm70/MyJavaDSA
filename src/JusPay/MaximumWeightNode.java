package JusPay;
import java.util.*;
public class MaximumWeightNode {
    public int solution(int[] edge) {
        int n = edge.length;
        long[] weights = new long[n]; // Use long to prevent overflow if N is large

        // Step 1: Calculate weights
        for (int i = 0; i < n; i++) {
            int source = i;
            int destination = edge[i];

            if (destination != -1) {
                weights[destination] += source;
            }
        }

        // Step 2: Find the node with max weight
        long maxWeight = -1;
        int maxWeightNode = -1;

        // We iterate from 0 to N-1.
        // If we find a weight EQUAL to current max, we update the node index.
        // This naturally picks the LARGEST index in case of a tie.
        for (int i = 0; i < n; i++) {
            if (weights[i] >= maxWeight) {
                maxWeight = weights[i];
                maxWeightNode = i;
            }
        }

        return maxWeightNode;
    }

    public static void main(String[] args) {
        MaximumWeightNode solver = new MaximumWeightNode();

        // Example 1: Standard case
        // 0->2, 1->2, 2->2, 3->2
        // Node 2 gets weights from 0, 1, 2, 3 -> Sum = 6
        int[] edge1 = {2, 2, 2, 2};
        System.out.println(solver.solution(edge1)); // Output: 2

        // Example 2: Tie-Breaking
        // 0->1 (Node 1 weight = 0)
        // 2->3 (Node 3 weight = 2)
        // Node 1 vs Node 3? Wait, input array: [1, -1, 3, -1]
        // Node 1 gets weight 0. Node 3 gets weight 2. Max is 3.
        int[] edge2 = {1, -1, 3, -1};
        System.out.println(solver.solution(edge2)); // Output: 3
    }
}
