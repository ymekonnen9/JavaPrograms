package chap01.sec01;

public class equalsString {

    public static void main(String[] args){
        String s = new String("Hello");
        String t = new String("Hello");

        System.out.println(s.equals(t));
        System.out.println(s != t);

    }
    
}
