package FactoryDemo;

import java.security.InvalidParameterException;

// static factory (static class)
public class ShapeFactory {
	public static IShape createShape(String shape){
		IShape createdShape;
		
		// when add a new shape, just add a new creation of the new sharp
		if(shape.toLowerCase().equals("circle")){
			createdShape = new Circle();
		}
		else if (shape.toLowerCase().equals("rectangle")){
			createdShape = new Rectangle();
		}
		else if (shape.toLowerCase().equals("triangle")){
			createdShape = new Triangle();
		}
		else{
			throw new InvalidParameterException("Parameter must be the correct shape");
		}
		
		return createdShape;
	}
}
