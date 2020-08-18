import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import de.mirkosertic.bytecoder.classlib.Array;

public class Question
{
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
	}

	private static void Test9()
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

