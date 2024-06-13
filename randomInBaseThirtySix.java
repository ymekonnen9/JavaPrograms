package chap01.JavaPrograms;
import java.util.Random;

public class randomInBaseThirtySix {
    public static void main(String[] args){
        Random rand = new Random();

        long output = rand.nextLong();
        System.out.print(Long.toString(output, 36));
    }
    
}
