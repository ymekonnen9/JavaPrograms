package chap01.JavaPrograms;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class lotteryWinner {

    public static void main(String[] args){
        int[] numArray = new int[50];
        Random rand = new Random();
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<numArray.length; i++){
            numArray[i] = i;
        }

        for(int i =0; i< 6; i++){
            int index = rand.nextInt(50);
            list.add(numArray[index]);
        }

        Collections.sort(list);

        System.out.println(list);

    }
    
}
