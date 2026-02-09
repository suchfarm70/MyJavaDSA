package JusPay;
import java.util.*;
public class LCTFin {
    public static long calculate(int[] edges){
        int n = edges.length;
        long maxCycleSum = -1;

        long[] pathSum = new long[n];
        int[] pathNode = new int[n];
        Arrays.fill(pathNode, -1);

        for(int i = 0 ; i < n ; i++){

            int curr = i;
            long currentSum = 0;

            while(curr != -1){

                if(pathNode[curr] != -1){

                    if(pathNode[curr] == i){
                        long cycleSum = currentSum - pathSum[curr];

                        if(cycleSum > maxCycleSum){
                            maxCycleSum = cycleSum;
                        }
                    }
                    break;
                }
                pathNode[curr] = i;
                pathSum[curr] = currentSum;
                currentSum += curr;
                curr = edges[curr];
            }
        }
        return maxCycleSum;
    }

    public static void main(String[] args){
        int[] edge = {1, 2, 0, 4, 3};
        int[] edge2 = {1, -1};
        System.out.println(calculate(edge2));
    }
}
