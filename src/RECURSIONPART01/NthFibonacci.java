package RECURSIONPART01;
public class NthFibonacci {

    static int calculator(int n){
        if(n == 0 || n == 1){
            return n;
        }

        return calculator(n - 1) + calculator(n - 2);
    }
    public static void main(String [] args){

        int answer = calculator(25);
        System.out.println(answer);
    }
}
