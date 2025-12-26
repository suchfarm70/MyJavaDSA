package RECURSIONPART01;
public class RecusionBasics {

    public static void PrintDec(int n){

        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        PrintDec(n - 1);
    }

    public static void PrintInc(int n){
        if(n == 1){
            System.out.print(n+" ");
            return;
        }

        PrintInc(n - 1);
        System.out.print(n+" ");
        
    }
    public static void main(String []args){
        PrintDec(10);
        System.out.println();
        PrintInc(10);
    }
}
