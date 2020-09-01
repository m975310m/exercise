import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

import org.apache.commons.lang.text.StrBuilder;
import de.mirkosertic.bytecoder.classlib.Array;

public class Question
{
	int i;
	static Hashtable htNumbers = new Hashtable();	
	public static void main(String[] args) 
	{
		//Test1();
		//Test2();
		//Test3();
		//Test4();
		//Test5();
		//Test6();
		//Test7();
		//Test8();
		//Test9();
		//記得複習
		//Test10();
		//Test11();
		//Test12();
		//Test13();
		//Test14();
		//Test15();
		//Test16();
		//Test17();
		//Test18();
		//Test19("123","33");
		
		//this是指class裡面的變數 不是帶進去使用的變數!
		//Test_this t = new Test_this();
		//t.thisFunction(300);
	}
	
	private static void Test19(String a,String b) 
	{
		try
		{
			int c = Integer.valueOf(a)+Integer.valueOf(b);
			System.out.println(c);
		}
		catch(NumberFormatException ne)
		{
			System.err.println("格式錯誤!");
		}
	}

	private static void Test18() 
	{
		A:
		for(int i=0;i<=10;i++) 
		{
			System.out.print("I="+i);
			B:
			for(int j=0;j<=10;j++)
			{
				System.out.print(","+j);
				if(i>5&&j==5)
				{
					break B;
				}
			}
			System.out.println();
		}
	}
	
	private static void Test17() 
	{
		B b = new B();
		System.out.println(b.getInt(10));
	}

	private static void Test16()
	{
		//宣告成null 不等於宣告一個空陣列
		String[] str_array = {};
		//等同於上面這句String[] str_array = new String[0];
		System.out.println(str_array.length);
	}

	private static void Test15()
	{
		Random r=new Random();
		int Ans = r.nextInt(100)+1;
		System.out.println("答案為"+Ans);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入數字1~100");
		String user_in = sc.next();
		while(!user_in.equals("end"))
		{
			try 
			{
				if(Integer.valueOf(user_in)==Ans)
				{
					System.out.println("答對!");
					break;
				}
				else if(Integer.valueOf(user_in)>Ans)
				{
					System.out.println("大!");
				}
				else if(Integer.valueOf(user_in)<Ans)
				{
					System.out.println("小!");
				}
			}
			catch(NumberFormatException e)
			{
				System.err.println("您輸入的資料非數值");
			}
			System.out.println("請輸入數字1~100");
			user_in = sc.next();
		}
	}

	private static void Test14()
	{
		//ArrayLisy轉Array Array轉ArrayList
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		arraylist.add(1);
		arraylist.add(3);
		arraylist.add(4);
		arraylist.add(2);
		arraylist.add(7);
		arraylist.add(9);
		System.out.println(arraylist);
		Integer[] array = (Integer[]) arraylist.toArray(new Integer[0]);
		for(int num:arraylist)
		{
			System.out.println(num);
		}
	}

	private static void Test13() 
	{
		Set set = new HashSet();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("A");
		System.out.println("SET不會儲存重放資料");
		System.out.println(set);
	}

	private static void Test12() 
	{
		String A = "100B";
		String B = "50";
		try
		{
			System.out.println(Integer.valueOf(A)+Integer.valueOf(B));
		}
		catch(NumberFormatException e) 
		{
			System.err.println("文字轉數字錯誤!!");
			System.out.println(e);
		}
	}

	private static void Test11()
	{
		TestClass t1 = new TestClass();
		TestClass t2 = new TestClass();
		t1.add();
		t2.add();
		System.out.println("a1: count is="+t1.num);
	    System.out.println("a2: count is="+t2.num);
	}

	private static int Test10_1(boolean a) 
	{
		try
		{
			if(a)
			{
				return 1;
			}
		}
		finally 
		{
			System.out.println("一定執行finally");
		}
		return 0;
	}
	
	private static void Test10() 
	{
		System.out.println(Test10_1(false));
	}

	public static void Test9()
	{
		String str = "420";
		str += 42;
		System.out.println("字串相加=42042");
		System.out.println(str);
	}

	private static void Test8()
	{
		htNumbers.put("one",new Integer(1));
		htNumbers.put("two",new Integer(2));
		htNumbers.put("three",new Integer(3));
		System.out.println("確認table是否有值");
		System.out.println(htNumbers.containsValue(4));
	}

	private static void Test7()
	{
		htNumbers.put("one",new Integer(1));
		htNumbers.put("two",new Integer(2));
		htNumbers.put("three",new Integer(3));
		System.out.println("印出大小：");
		System.out.println(htNumbers.size());
	}

	private static void Test6()
	{
		
		htNumbers.put("one",new Integer(1));
		htNumbers.put("two",new Integer(2));
		htNumbers.put("three",new Integer(3));
		//forEach(Key名稱,Value名稱)->引用至後面
		System.out.println("使用：htNumbers.forEach((v,k)->System.out.println(v+\",\"+k));");
		htNumbers.forEach((v,k)->System.out.println(v+","+k));
		System.out.println("使用for迴圈");
		System.out.println("先宣告Set<String> keys = htNumbers.keySet();");
		Set<String> keys = htNumbers.keySet();
        for(String key: keys)
        {
            System.out.println("Value of "+key+" is: "+htNumbers.get(key));
        }

	}

	private static void Test5()
	{
		int start = 50;
		int end = 100;
		int sum = 0;
		for(int i=start;i<=end;i++)
		{
			if(i%3==0&&i%2!=0)
			{
				System.out.println(i);
				sum+=i;
			}
		}	
		System.out.println(sum);
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
		String path = "source/";
		File f = new File(path+"Read.txt");
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(f));
			String line = br.readLine();
			int File_num = 0;
			while (line != null)
			{	
				File add_f = new File(path+"abc-"+File_num+".txt");
				add_f.createNewFile();
				File_num++;
				//FileWriter(檔案名稱,布林值(true=接續之前檔案 false=覆蓋之前檔案))
				BufferedWriter wr = new BufferedWriter(new FileWriter(add_f,false));
				wr.append(line);
				System.out.println("檔案："+add_f.getName()+" 寫入資料="+line);
				wr.close();
				//一次讀入一行資料
				line = br.readLine(); 
			}
			br.close();
		} 
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}

//實際上操作的卻是同一區塊，證明 static 變數不是跟其他同 class 的元素一起放在heap區，而是獨立放在靜態區
class TestClass 
{
	static int num = 0;
	public void add()
	{
		num++;
	}
}

class A
{
	protected int getInt(int i){return i;}
}
class B extends A
{
//	public int getInt(int i){return i;}
//	private int getInt(long i){return (int)i;}
	protected int getInt(long i){return (int)i;}
}