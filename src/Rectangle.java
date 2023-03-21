//create a class Rectangle
public class Rectangle {
    //Two final instance variable and assign some static value
    final int width = 10;
    final int height = 12;

    //create one final method that is getArea()
    final int getArea() {
        return width * height;
    }
}

//create a main class which extends parent class
class Main extends Rectangle {
    //final method that is getArea cannot be overriden by subclass.it generated an error.
    // When a method is declared as the final method in the parent class, then any child class cannot override or modify the final method.

    int getArea() {
        return 10;
    }

    public static void main(String[] args) {
        //create an object of rectangle class
        Rectangle r = new Rectangle();

        //try to change the value of width and height variable it will generate an error.
        //because the width and height are final variable that means its value cannot be changed.
        r.width = 20;
        r.height = 10;

        //Call the final method in child class it should not generate an error.
        r.getArea();
    }
}


