package org.example.factory;

import static org.example.factory.ShapeType.CIRCLE;
import static org.example.factory.ShapeType.RECTANGLE;
import static org.example.factory.ShapeType.SQUARE;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape(CIRCLE);
        shape1.draw();

        Shape shape2 = shapeFactory.getShape(RECTANGLE);
        shape2.draw();

        Shape shape3 = shapeFactory.getShape(SQUARE);
        shape3.draw();
    }
}
