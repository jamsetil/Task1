package org.abbtech.Tasks.Task8.AbstractFactoryPattern;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
       AbstractFactory shape= FactoryProducer.getFactory("shape");
       Shape shape1 = shape.getShape("rectangle");
       shape1.draw();

       AbstractFactory shapeCircle = FactoryProducer.getFactory("shape");
       Shape circle = shapeCircle.getShape("circle");
       circle.draw();

       AbstractFactory color = FactoryProducer.getFactory("color");
       Color color1 = color.getColor("blue");
       color1.fill();

       AbstractFactory colorRed = FactoryProducer.getFactory("color");
       Color color2 = colorRed.getColor("red");
       color2.fill();
    }
}
