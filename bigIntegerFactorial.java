package chap01.JavaPrograms;
import java.math.BigInteger;

public class bigIntegerFactorial {
    public static void main(String[] args){
        BigInteger n = new BigInteger("1");
        for(int i = 1; i< 1000; i++){
            n = n.multiply(new BigInteger(""+i));
        }
        System.out.println(n);
        

        
    }
    
}
