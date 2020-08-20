package com.exercise.test;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.Vector;
import org.apache.hc.core5.http.impl.IncomingEntityDetails;
import de.mirkosertic.bytecoder.classlib.Array;
import io.reactivex.internal.observers.ForEachWhileObserver;

public class doit
{
	public static void main(String[] args) 
	{
		//Q1();
		//Q2();
		//Q3();
		//Q4();
		Q5();
	}
	
	private static void Q5() 
	{
		Vector v = new Vector();
		v.addElement("line 1");
		v.addElement("line 2");
		v.addElement("line 3");
		v.addElement("line 4");
		v.addElement("line 5");
		v.removeElement("line 2");
		v.insertElementAt("line 3.1",v.indexOf("line 4"));
		System.out.println(v.indexOf("line 3")!=-1);
		System.out.println(v);
		String[] array = new String[v.size()];
		for(int i=0;i<v.size();i++)
		{
			array[i] = String.valueOf(v.get(i));
			System.out.println(Arrays.toString(array));
		}
	}

	private static void Q4()
	{
		Hashtable hashtable = new Hashtable();
		hashtable.put("one",new Integer(1));
		hashtable.put("two",new Integer(2));
		hashtable.put("three",new Integer(3));
		hashtable.put("for",new Integer(4));
		hashtable.put("five",new Integer(5));
		System.out.println(hashtable.containsValue(1));
		System.out.println(hashtable.size());
	}

	private static void Q3()
	{
		Hashtable hashtable = new Hashtable();
		hashtable.put("one",new Integer(1));
		hashtable.put("two",new Integer(2));
		hashtable.put("three",new Integer(3));
		hashtable.put("for",new Integer(4));
		hashtable.put("five",new Integer(5));
		hashtable.forEach((k,v)->System.out.println("K："+k+" V："+v));
		
	}


	private static void Q2() 
	{
		int[] a = {1,41,20,11,18,24,91,55,20,1};
		ArrayList<Integer> push_array = new ArrayList<Integer>();
		for(int num:a)
		{
			if(push_array.indexOf(num)==-1)
			{
				push_array.add(num);
			}
		}
		Collections.sort(push_array);
		//push_array.sort(null);
		System.out.println(push_array);
	}

	private static void Q1() 
	{
		File f = new File("QQ.txt");
		String file_name = "QQ";
		try 
		{
			BufferedReader br = new BufferedReader(new FileReader(f));
			String msg = br.readLine();
			int f_num = 0;
			while(msg!=null)
			{
				File add_f = new File(file_name+"_"+f_num+".txt");
				BufferedWriter bw = new BufferedWriter(new FileWriter(add_f));
				f_num++;
				bw.append(msg);
				bw.close();
				System.out.println("寫入："+add_f.getName()+",訊息="+msg);
				msg = br.readLine();
			}
			br.close();
		}
		catch (Exception e) 
		{
			// TODO: handle exception
		}
	}
	
}
