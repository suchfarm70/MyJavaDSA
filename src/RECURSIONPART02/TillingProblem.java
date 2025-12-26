package RECURSIONPART02;
public class TillingProblem {

    static int calculatetotalways(int n){

        //right here if n equals to 0 or 1 we return 1 because we consider "not placing any tile"as one way as well
        if(n == 0 || n == 1){
            return 1;
        }

        //now the choice to place a tile horizontally or vertically

        int fnm1 = calculatetotalways(n - 1);

        int fnm2 = calculatetotalways(n - 2);

        int totalways = fnm1 + fnm2;


        return totalways;
    }
    public static void main(String [] Strings){
        System.out.println(calculatetotalways(4));
    }
}
