package com.exercise.Test_implements;

public class CCircle implements CShape
{
	//半徑
	double radius;
	public CCircle(double radius) 
	{
		this.radius = radius;
	}
	
	@Override
	public double show() 
	{
		return pi*radius*radius;
	}
}
