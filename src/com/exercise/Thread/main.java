package com.exercise.Thread;

public class main 
{
	public static void main(String[] args) 
	{
		myJob1 work1 = new myJob1();
		myJob2 work2 = new myJob2();
		
		System.out.println("建立執行緒");
		Thread cpu1 = new Thread(work1);
		Thread cpu2 = new Thread(work2);
		

		System.out.println("啟動執行緒");
		cpu1.start();
		cpu2.start();
		
		System.out.println("結束執行緒");
	}
}
