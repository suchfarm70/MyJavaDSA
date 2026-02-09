package JusPay;

import java.util.Arrays;

public class NearestMeetingCell {
    public int solution(int[] edge, int C1, int C2) {
        int n = edge.length;

        // Step 1: Calculate distances from C1
        long[] dist1 = new long[n];
        Arrays.fill(dist1, -1);

        int curr = C1;
        long d = 0;
        while (curr != -1 && dist1[curr] == -1) {
            dist1[curr] = d++;
            curr = edge[curr];
        }

        // Step 2: Calculate distances from C2
        long[] dist2 = new long[n];
        Arrays.fill(dist2, -1);

        curr = C2;
        d = 0;
        while (curr != -1 && dist2[curr] == -1) {
            dist2[curr] = d++;
            curr = edge[curr];
        }

        // Step 3: Find the nearest meeting node
        long minDist = Long.MAX_VALUE;
        int meetingNode = -1;

        for (int i = 0; i < n; i++) {
            // Check if node i is reachable from both C1 and C2
            if (dist1[i] != -1 && dist2[i] != -1) {
                long combinedDist = dist1[i] + dist2[i];

                if (combinedDist < minDist) {
                    minDist = combinedDist;
                    meetingNode = i;
                } else if (combinedDist == minDist) {
                    // Tie-breaking: Pick the larger Node ID
                    if (i > meetingNode) {
                        meetingNode = i;
                    }
                }
            }
        }

        return meetingNode;
    }

    public static void main(String[] args) {
        NearestMeetingCell solver = new NearestMeetingCell();

        // Example 1:
        // 0->1, 1->2, 2->3
        // C1=0, C2=1
        // Meeting point is 1 (0->1 is 1 step, 1->1 is 0 steps. Total=1)
        // Meeting point is 2 (0->1->2 is 2 steps, 1->2 is 1 step. Total=3)
        // Min is Node 1.
        int[] edges = {1, 2, 3, -1};
        System.out.println(solver.solution(edges, 0, 1)); // Output: 1
    }
}
