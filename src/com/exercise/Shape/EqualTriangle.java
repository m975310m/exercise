package com.exercise.Shape;

public class EqualTriangle extends Shape 
{

	public EqualTriangle(String name, double width, double height)
	{
		super(name, width, height);
		// TODO Auto-generated constructor stub
	}
	
	double area()
	{  
		return (width * height) / 2 ;  
    } 
	
    double perimeter()
    {        
	   return 3 * width; 
    }
}
