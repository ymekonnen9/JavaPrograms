package chap01.sec01;
import java.util.Scanner;

public class printNumbers{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a Number");
    int num = in.nextInt();
    System.out.println("The binary form of the number you entered is"+Integer.toBinaryString(num));
    System.out.printf("The octal form of the number you entered is %o \n",num );
    System.out.printf("The Hexadecimal form of the number you enetered is %x \n", num);
    System.out.printf("The Hexadecimal form of the reciprocal of the number you entered is "+ Float.toHexString((float)1.0/num));
  }



}