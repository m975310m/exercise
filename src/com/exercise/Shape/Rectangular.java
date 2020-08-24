package com.exercise.Shape;

class Rectangular extends Shape 
{
    public Rectangular(double length, double width, String name)
    {  
    	//在子類別中呼叫父類別的建構方法用super()  
    	super(length, width, name);
    }
    
    // 因為繼承Shape類別, 因此要實作area和perimeter的abstract class
    double area()
    {  
    	return length * width;  
    }
    
    double perimeter()
    {  
    	return (length + width) * 2; 
    }
}