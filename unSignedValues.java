package chap01.JavaPrograms;
import java.util.Scanner;

public class unSignedValues {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers between 0 and 4294967295");
        int x = in.nextInt();
        int y = in.nextInt();
        
        System.out.println("Their Sum " +(Integer.toUnsignedLong(x) + Integer.toUnsignedLong(y))); 
        System.out.println("Their Difference " +(Integer.toUnsignedLong(x) - Integer.toUnsignedLong(y))); 
        System.out.println("Their Product " +(Integer.toUnsignedLong(x) * Integer.toUnsignedLong(y))); 
        System.out.println("Their Quotient " +(Integer.toUnsignedLong(x) / Integer.toUnsignedLong(y))); 
        System.out.println("Their Remainder " +(Integer.toUnsignedLong(x) % Integer.toUnsignedLong(y))); 



    }
    
}
