package com.exercise.Test_implements;
public class Cat implements animal
{
	@Override
	public String call() 
	{
		return "喵~";
	}
	
	@Override
	public String expert() 
	{
		return "爬牆";
	}	
}
