package chap01.JavaPrograms;
import java.util.Scanner;

public class nonEmptyString {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = in.nextLine();
        String removed = input.trim();
        System.out.println(removed);
    }
    
}
