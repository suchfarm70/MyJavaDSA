package JusPay;
import java.util.*;
public class LCTFinTwo {
    public static long calculate(int[] edges){
        int n = edges.length;
        long MaxCycleSum = -1;

        long[] pathSum = new long[n];
        int[] pathNode = new int[n];
        Arrays.fill(pathNode , -1);

        for(int i = 0 ; i < n ; i ++){
            int curr = i;
            long currentSum = 0;

            while(curr != -1){

                if(pathNode[curr] != -1){

                    if(pathNode[curr] == i){
                        long maxCycle = currentSum - pathSum[curr];

                        if(maxCycle > MaxCycleSum){
                            MaxCycleSum = maxCycle;
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
        return MaxCycleSum;
    }
    public static void main(String[] args){
        int[] edges = {1,-1};
        int[] edges2 = {1,2,0,4,3};
        System.out.println(calculate(edges));
    }
}
