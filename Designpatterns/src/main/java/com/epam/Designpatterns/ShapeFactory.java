package com.epam.Designpatterns;

public class ShapeFactory extends AbstractFactory {
	   @Override
	   public Shape getShape(String shapeType){    
	      if(shapeType.equalsIgnoreCase("RECTANGLE")){
	         return new Rectangle();         
	      }
	      
	      return null;
	   }
	}
