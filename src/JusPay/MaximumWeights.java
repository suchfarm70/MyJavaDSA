package JusPay;
public class MaximumWeights {
    public static int solution(int [] edges){
        int n = edges.length;
        long[] weights = new long[n];
        for(int i = 0 ; i < n ; i++){
            int source = i;
            int destination = edges[i];
            if(destination != -1){
                weights[destination] += source;
            }
        }
        long maxWeight = -1;
        int maxWeightNode = -1;
        for(int i = 0 ;i < n ; i++){
            if(weights[i] > maxWeight){
                maxWeight = weights[i];
                maxWeightNode = i;
            }
        }
        return maxWeightNode;
    }
    public static void main(String[] args){
        int[] edges = {2,0,2,2};
        System.out.println(solution(edges));
    }
}
