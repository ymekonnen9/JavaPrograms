package chap01.JavaPrograms;
import java.util.Scanner;

public class twoDarray {   
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the dimension of the square array");
        int dimension = in.nextInt();
        int [][] arra = new int[dimension][dimension];
        System.out.println("Enter your numbers and hit the Enter");   

        for(int i = 0; i < dimension; i++){
            for(int j = 0; j < dimension; j++){
                arra[i][j] = in.nextInt();
            }
        }

        System.out.println("The 2-dimensional array you entered:");
        for(int i = 0; i < dimension; i++){
            for(int j = 0; j < dimension; j++){
                System.out.print(arra[i][j] + " ");
            }
            System.out.println();
        }
        
        
    }   
}
