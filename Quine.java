package chap01.sec01;

public class Quine {

    public static void main(String[] args){
       String quine = """
           public class Quine{
               public static void main(String[] args){
                  int [] y = {1, 2 ,3 , 4, 5};

                  for(int i =0; i< y.length; i++){
                      System.out.println(y[i])
                  }
               }
           }
               
               """; 

               System.out.println(quine);
    }



    
    
}
