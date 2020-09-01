package com.exercise.Thread;

public class myJob2 implements Runnable
{
	@Override
	public void run() 
	{
		for(int i=0;i<=30;i++)
		{
			System.out.println(Thread.currentThread().getName()+"執行第"+i+"次");
		}
	}
}
