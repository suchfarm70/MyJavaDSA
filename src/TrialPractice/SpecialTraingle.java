package TrialPractice;
public class SpecialTraingle {
    public static void mytriangle(int side){
        char matrix[][] = new char[side][side];
        for(int i = 0 ; i < side ; i++){
            for(int j = 0 ; j < side ; j++){
                matrix[i][j] = '.'; 
            }
        }

        for(int i = 0 ; i < side ; i++){
            for(int j = 0 ; j < side ; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String [] args){
        int matrix_side = 1000;
        mytriangle(matrix_side);
    }
}
