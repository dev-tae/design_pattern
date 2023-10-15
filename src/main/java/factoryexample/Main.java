package main.java.factoryexample;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Get a circle and draw it
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        // Get a square and draw it
        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();

    }
}