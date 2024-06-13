package chap01.JavaPrograms;

public class equalsString {

    public static void main(String[] args){
        String s = new String("Hello");
        String t = new String("Hello");

        System.out.println(s.equals(t));
        System.out.println(s != t);

    }
    
}
