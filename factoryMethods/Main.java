package factoryMethods;


public class Main{
    public static void main(String[] args){
        Shape shape = Shape.createShape("circle");
        shape.draw();
    }
}