package org.abbtech.Tasks.Task8.AbstractFactoryPatterns.Version1;

public class ShapeFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String shape) {
        if (shape==null){
            return null;
        }
        if (shape.equalsIgnoreCase("CIRCLE")){
         return new Circle();
        } else if (shape.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        return null;
    }
}
