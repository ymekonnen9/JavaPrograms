package chap01.JavaPrograms;
import java.util.Arrays;
import java.util.Scanner;
enum Directions {N, W, S, E}

public class adjustableCompass {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input = in.next();
        try{
        int [] coordinate = {0, 0};
        int [] final_coordinate = {0,0};    
        Directions dir = Directions.valueOf(input);

        switch(dir){
            case N:
                final_coordinate[0] = coordinate[0];
                final_coordinate[1] = coordinate[0] + 1;
                System.out.println(Arrays.toString(final_coordinate));
                break;
            case S:
                final_coordinate[0] = coordinate[0];
                final_coordinate[1] = coordinate[0] - 1;
                System.out.println(Arrays.toString(final_coordinate));
                break;
            case W:
                final_coordinate[0] = coordinate[0] - 1;
                final_coordinate[1] = coordinate[0] ;
                System.out.println(Arrays.toString(final_coordinate));
                break;
            case E:
                final_coordinate[0] = coordinate[0] + 1;
                final_coordinate[1] = coordinate[0];
                System.out.println(Arrays.toString(final_coordinate));
                break;
            default:
                 System.out.println("Probably you enetered something wrong");
        }
         } catch(IllegalArgumentException e){
            System.out.println(input + " The input isn't a direction");
         }
    }
}
