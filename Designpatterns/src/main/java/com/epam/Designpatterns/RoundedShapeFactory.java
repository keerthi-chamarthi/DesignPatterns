package com.epam.Designpatterns;

public class RoundedShapeFactory extends AbstractFactory {
	   @Override
	   public Shape getShape(String shapeType){    
	       if(shapeType.equalsIgnoreCase("SQUARE")){
	         return new RoundedSquare();
	      }	 
	      return null;
	   }
	}
