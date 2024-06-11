package chap01.sec01;

public class castingDoubleToInt {
    public static void main(String[] args){
        double veryLargeDouble = 786678898787876767767677.0;
        int inT = (int)veryLargeDouble;
        System.out.println(veryLargeDouble);
        System.out.println(inT); //it can only print the maximum int which is 214748364
    }
    
}
