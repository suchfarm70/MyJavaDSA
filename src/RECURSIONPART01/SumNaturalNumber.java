package RECURSIONPART01;
public class SumNaturalNumber {

    static int sum(int n){
        if(n == 1){
            return n;
        }

        return n + sum(n - 1);
    }
    public static void main(String [] args){
        int answer = sum(5);
        System.out.println(answer);
    }
}
