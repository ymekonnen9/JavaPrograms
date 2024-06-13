package chap01.JavaPrograms;
import java.util.Arrays;
import java.util.Scanner;

enum Directions {N, S, E, W};

public class compassDirection{

    public static void main(String[] args) throws IllegalAccessException{
        Scanner in = new Scanner(System.in);
        String input = in.next();
        try{
        Directions dir = Directions.valueOf(input);
        int [] coordinate;
        
        switch(dir){
            case N: coordinate = new int[] {0, 1};
                    System.out.println(Arrays.toString(coordinate));
            break;
            case S: coordinate = new int[] {0, -1};
                    System.out.println(Arrays.toString(coordinate));
            break;
            case E: coordinate = new int[] {1, 0};
                    System.out.println(Arrays.toString(coordinate));
            break;
            case W: coordinate = new int[] {-1, 0};
                    System.out.println(Arrays.toString(coordinate));
            break;
            default: System.out.println(input + "Not found");
        }

        }catch(IllegalArgumentException e){
            System.out.println(input + " This input doesn't belong to a direction");
        }
        
    }
    
}
