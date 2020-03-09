package com.epam.Designpatterns;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Singleton");
    	Singleton object = Singleton.getInstance();
        object.showMessage();
        System.out.println("AbstractFactory");
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        shape1.draw();
        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
        Shape shape2 = shapeFactory1.getShape("SQUARE");
        shape2.draw();
    }
    
}
