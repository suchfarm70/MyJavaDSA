package RECURSIONPART01;
public class RecursionPowerofNOptimized {

    static int powercalculator(int a , int n){
        if(n == 0){
            return 1;
        }

        int halfpower = powercalculator(a , n/2);
        int halfpowerSq = halfpower * halfpower;

        if(n % 2 != 0){
            halfpowerSq = a * halfpowerSq;
        }

        return halfpowerSq;
    } 
    public static void main(String [] args){
        System.out.println(powercalculator(2, 10));
    }
}
