package chap01.JavaPrograms;
import java.util.Scanner;

public class greatestOfThree {
    
    public static void main(String [] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter three numbers to compare:");
    int A = in.nextInt();
    int B = in.nextInt();
    int C = in.nextInt();
    System.out.println(Math.max(A,Math.max(B, C)));

    }
    

  
}
