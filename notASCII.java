package chap01.sec01;
import java.util.Scanner;

public class notASCII {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a text:");
        String input = in.nextLine();

        for(int i = 0; i< input.length(); i++){
            char t = input.charAt(i);
            if( t > 127){
                System.out.println((int) t);
            }
        }



    }
    
}
