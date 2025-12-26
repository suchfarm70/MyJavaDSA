package RECURSIONPART01;
public class RecursionPowerofN {

    static int power(int n , int x){

        if(x == 0){
            return 1;
        }
        return 2 * power(n , x - 1);
    }
    public static void main(String [] args){
        System.out.println(power(2, 10));
    }
}
