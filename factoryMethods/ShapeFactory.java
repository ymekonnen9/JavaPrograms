package factoryMethods;

class ShapeFactory{
    public static Shape createShape(String name) throws IllegalArgumentException{
        switch(name){
            case "circle":
                return new Circle();
            case "square": 
                return new Square();
            case "rectangle": 
                return new Rectangle();
            default: 
                throw new IllegalArgumentException( name +" The name is not a shape" );   
        }
    }
}