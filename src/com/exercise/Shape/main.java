package com.exercise.Shape;

public class main 
{
	public static void main(String[] args)
	{
		EqualTriangle et= new EqualTriangle("Andy", 10, 20);
		System.out.println(et.area());
		System.out.println(et.perimeter());
		
		Rectangular rt = new Rectangular(20, 15, "Andy");
		System.out.println(rt.area());
		System.out.println(rt.perimeter());
	}
}
