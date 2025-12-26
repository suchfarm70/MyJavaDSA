package RECURSIONPART01;
public class FactorialofN {
    static int fact(int n){
        if(n == 0){
            return 1;
        }
        return fact(n - 1) * n;
    }
    public static void main(String [] args){
        //int answer = fact(5);
        System.out.println(fact(5));
    }
}
