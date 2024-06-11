package chap01.sec01;
import java.util.Scanner;

public class normalizeAngle {
  public static void main(String[] args){
  Scanner in = new Scanner(System.in);
  
  System.out.println("Enter a degree(positive or negative):");
  int degree = in.nextInt();
  // int normalized = Math.abs(degree) % 360;
  int normalized = Math.floorMod(degree, 360);
  System.out.println("The normalized angle between 0 and 359 is "+normalized);
    
}

}
