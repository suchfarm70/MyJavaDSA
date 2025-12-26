package RECURSIONPART02;
public class BinaryStringProblem {

    public static  void printBinStrings(int n , int lasplace , String str){

        if(n == 0){
            System.out.println(str);
            return;
        }

        if(lasplace == 0){
            printBinStrings(n - 1 , 0 , str+"0");
            printBinStrings(n - 1, 1, str+"1");
        } else {
            printBinStrings(n - 1 , 0 , str+"0");
        }
    }
    public static void main(String [] args){
        String str = "";
        printBinStrings(3, 0, str);
    }
}
