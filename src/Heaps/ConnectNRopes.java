package Heaps;
import java.util.*;
public class ConnectNRopes {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0 ; i < n ; i++){
            pq.add(sc.nextInt());
        }
        int cost = 0;
        while(pq.size() > 1) {
            int min = pq.remove();
            int min2 = pq.remove();
            cost = cost + min + min2;

            pq.add(min + min2);
        }

        System.out.println(pq);
        System.out.println(cost);
    }
}
