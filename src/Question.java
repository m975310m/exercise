import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

import de.mirkosertic.bytecoder.classlib.Array;

public class Question 
{

	public static void main(String[] args) 
	{
		//Test1();
		//Test2();
		//Test3();
		Test4();
	}

	private static void Test4()
	{
		Vector v = new Vector();
		v.addElement("line 1");
		v.addElement("line 2");
		v.addElement("line 3");
		v.addElement("line 4");
		//Q1
		v.addElement("line 5");
		//Q2
		v.removeElement("line 2");
		System.out.println(v);
		//Q3
		System.out.println(v.indexOf("line 3")==-1);
		//Q4
		v.insertElementAt("line 3.1",v.indexOf("line 4"));
		System.out.println(v);
		//Q5
		v.sort(null);
		int size = v.size();
		String[] array = new String[size];
		for(int i=0;i<size;i++)
		{
			array[i] = String.valueOf(v.get(i));
		}
		System.out.println(Arrays.toString(array));
	}

	private static void Test3()
	{
		Vector v1 = new Vector();
		v1.addElement("1");
		v1.addElement("2");
		v1.addElement("3");
		v1.addElement("4");
		v1.addElement("5");
		order(v1);
		v1.addElement("1");
		System.out.println(v1);
	}

	private static void order(Vector v1)
	{
		v1 = new Vector();
		v1.addElement("6");
		v1.addElement("6");
		v1.addElement("9");
		v1.addElement("0");
	}
	
	private static void Test2()
	{
		int[] array = {2,5,6,7,8,2,3,4,6,10};
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int num:array)
		{	
			if(a.indexOf(num)==-1)
			{
				a.add(num);
			}
		}
		Collections.sort(a);
		System.out.println(a);
	}

	private static void Test1()
	{
		
		
	}
	
}

