package com.exercise.Test_implements;

public class main 
{
	public static void main(String[] args) 
	{
		//Animal();
		CShape();
	}

	private static void CShape()
	{
		CCircle cc = new CCircle(10);
		System.out.println("面積="+cc.show());
	}

	private static void Animal() 
	{
		Cat cat = new Cat();
		Dog dog = new Dog();
		System.out.println("貓：");
		System.out.println("叫聲："+cat.call()+"專長："+cat.expert());
		System.out.println("狗：");
		System.out.println("叫聲："+dog.call()+"專長："+dog.expert());
		if(cat instanceof animal)
		{
			System.out.println("Y");
		}
		else
		{
			System.out.println("N");
		}
	}
}
