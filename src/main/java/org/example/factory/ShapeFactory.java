package org.example.factory;

import static org.example.factory.ShapeType.CIRCLE;
import static org.example.factory.ShapeType.RECTANGLE;
import static org.example.factory.ShapeType.SQUARE;

public class ShapeFactory {

    public Shape getShape(ShapeType shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equals(CIRCLE)){
            return new Circle();

        } else if(shapeType.equals(RECTANGLE)){
            return new Rectangle();

        } else if(shapeType.equals(SQUARE)){
            return new Square();
        }

        return null;
    }
}
