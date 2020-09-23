package com.exercise.test;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.attribute.AclEntry.Builder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.crypto.dsig.keyinfo.PGPData;

public class Test_value_reage {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//reage();
		//ass();
		//ass_final();
		//ass_DoubleToInt();
		//if_fromt();
		//bitwise();
		//bytetest();
		//encryption();
		//Testcase();
		//Testwhile();
		//TestDate();
		//TestUpperLower();
		//Testequals();
		//TestWrapper();
		//TestAutoBox();
		//20200804.page-112
		//TesrforEach();
		//TesrforEach2();
		//TestNewValue();
		//TestCharAt();
		//Testchar_array();
		//Testappend();
		//Testsplit();
		//TestRegular();
		//20200806.page-135
		//TestPattern();
		//20200807.page-138
		//TestVector();
		//TestArraySort();
	}
	private static void TestArraySort() 
	{
		int[] a = {3,4,62,7,124,62,35,2,4,3,4};
		//排序
		System.out.println(Arrays.toString(a));
		//宣告一個ArrayList
		ArrayList<Integer> b= new ArrayList<Integer>();
		for(int num:a)
		{
			if(b.indexOf(num)==-1)
			{
				b.add(num);
			}
		}
		Collections.sort(b);
		System.out.println(b);
	}

	private static void TestVector() 
	{
		// Vector 為一可置入"任意物件"的"動態陣列"(可隨內含物多寡增減其長度)
		Vector <Integer> v1 = new Vector();
		v1.addElement(new Integer(50));
		v1.addElement(new Integer(100));
		v1.addElement(new Integer(150));
		v1.addElement(new Integer(130));
		System.out.println("建造出Vector="+v1);
		v1.add(17);
		System.out.println("Vector.add後="+v1);
		System.out.println("Vector.size="+v1.size());
		System.out.println("Vector.contains找尋3.2="+v1.contains(150));
		v1.add(v1.indexOf(150),new Integer(230));
		System.out.println("在150前新增="+v1);
		//遞增
		Collections.sort(v1);
		//遞減Collections.sort(v1,Collections.reverseOrder());
		System.out.println("排序後="+v1);
		System.out.println("迴圈印出");
		for(int num:v1)
		{
			System.out.println(num);
		}
	}
	
	//用靜態方法重複使用找尋資料
	private static void TestPattern()
	{
		String phone1 ="0987242390,0987536636,0982536636,0983536636,0982536636";
		String phone2 ="0987888883,0987123444";
		//創造一個Patrern  =Pattern.compile(正則規則)
		Pattern pattern = Pattern.compile("0987[\\d]{6}");
		//創造一格Matcher 使用Pattern
		Matcher matcher = pattern.matcher(phone1);
		while(matcher.find())
		{	
			System.out.println("phone1="+matcher.group());
		}
		matcher = pattern.matcher(phone2);
		while(matcher.find())
		{
			System.out.println("phone2="+matcher.group());
		}
		System.out.println();
	}
	
	//正則表達式
	//	|:--|:
	//	| . | 符合任一字元
	//	| \d | 符合 0 到 9 任一個數字字元
	//	| \D | 符合 0-9 以外的字元
	//	| \s | 符合 '\t'、'\n'、'\x0B'、'\f'、'\r' 等空白字元
	//	| \w | 符合 a 到 z、A 到 Z、0 到 9 等字元,也就是數字或是字母都符合
	//	| \W | 符合 a 到 z、A 到 Z、0 到 9 等之外的字元,也就是除數字與字母外都符合
	private static void TestRegular() 
	{
		String phone ="0987242390";
		//09開頭[符合規則]{長度}
		String phone_Reg = "09[\\d]{8}";
		System.out.println("手機邏輯="+phone.matches(phone_Reg));
		
		String T_phone = "03-28126592";
		//2碼-{碼長可能} 7 or 8
		String T_phone_Reg ="0[\\d]{1}-[\\d]{7,8}";
		System.out.println("電話邏輯="+T_phone.matches(T_phone_Reg));
		
		String email = "a88331144a@gmail.com.tw";
		//文字+數字{1~63}@文字+數字{2~63}.英文a-zA-Z{2~63} (.a-zA-Z{2~63})出現0次到1次
		String email_Reg ="[\\w]{1,63}@[\\w]{2,63}.[a-zA-Z]{2,63}(.[a-zA-Z]{2,63})?";
		System.out.println("信箱邏輯="+email.matches(email_Reg));
	}

	//切割字串 
	private static void Testsplit() 
	{
		String str = "abcdebcadxbc";
		//切割任一字元加上c
		String[] str_array = str.split(".c");
		for(String text:str_array)
		{
			System.out.println(text);
		}
	}

	//StringBuffer可以有效使用記憶體,長期使用+會產生一個新的String
	private static void Testappend()
	{
		StringBuffer builder = new StringBuffer("");
		for(int i=0;i<10;i++)
		{
			builder.append(i);
		}
		System.out.println(builder);
	}

	private static void Testchar_array()
	{
		char[] a = {'A','n','d','y'};
		String str = new String(a);
		System.out.println(str);
		System.out.println("使用endsWish驗證最後是否為特定字元");
		System.out.println("確認是否為ndy結尾="+str.endsWith("ndy"));
	}

	private static void TestCharAt() 
	{
		String text = "Test_Value";
		for(int i = 0 ; i < text.length();i++)
		{
			System.out.println("charAt("+i+")="+text.charAt(i));
		}
	}

	private static void TestNewValue()
	{
		int[] a_array = new int[3];
		System.out.println(a_array[1]);
		
		Integer[] b_array = new Integer[3];
		System.out.println(b_array[1]);
	}

	//二微陣列,先將{{"A","B","C"},{"D","E","F"},{"G"}} > 分別丟進 {"A","B","C"},{"D","E","F"},{"G"} > 把個別元素印出
	private static void TesrforEach2()
	{
		String[][] a = {{"A","B","C"},{"D","E","F"},{"G"}};
		for(String[] row:a)
		{
			for(String element:row)
			{
				System.out.println(element);
			}
		}
	}

	//練習for迴圈使用陣列將全部資料印出 foreach
	private static void TesrforEach() 
	{
		String[] a = {"A","B","C","D"};
		//每一次從陣列中抓取的value 加載到 element裡面 寫法 for(類型 變數名:陣列)
		for(String element:a)
		{
			System.out.println(element);
		}
	}

	//編譯器 自動裝箱 (物件)動作
	//自動裝箱會重複只用-128~127的數值 當兩個超過該值會占用不同記憶體,故兩個100答案=true,為200時因為記憶體 
	private static void TestAutoBox()
	{
		//相當於 Integer num_1 = new Integer(100);
		Integer num_1 = 200;

		//也可以使用 
		int n2 = 200;
		Integer num_2 = n2;
		
		if(num_1==num_2)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
	}

	//Wrapper 將基本型態 包裝後做運用
	private static void TestWrapper()
	{
		int num1 = 10;
		int num2 = 20;
		Integer int_num1 = new Integer(num1);
		System.out.println("運用Wrapper:"+int_num1.doubleValue()/3);
		System.out.println("無運用:"+num1/3);
		//compareTo 大於=1,等於=0,小於=-3
		System.out.println(int_num1.compareTo(num2));
	}
	
	//equals = String比對
	private static void Testequals() 
	{
		//預設使用者輸入帳號 admin 密碼1234;
		String user = "admin";
		String password = "1234";
		System.out.println("登入結果:" + ("admin".equals(user) && "1234".equals(password) ? "成功" : "失敗" ));
	}

	//大小寫轉換
	private static void TestUpperLower()
	{
		//轉大寫
		String text1 = "hello~";
		System.out.println(text1.toUpperCase());
		//轉小寫
		String text2 = "BEY~";
		System.out.println(text2.toLowerCase());
	}

	//使用java 工具抓取時間
	private static void TestDate()
	{
		Date date = new Date();
		System.out.println(date);
	}
	
	//練習while迴圈,控制符合答案才往下執行
	private static void Testwhile()
	{
		Scanner Sc = new Scanner(System.in);
		int total = 0;
		int count = -1;
		int in_num = 0;
		while(in_num!=-1)
		{
			count++;
			total += in_num;
			System.out.println("請輸入數字(-1結束):");
			in_num = Sc.nextInt();
		}
		System.out.println("數量="+count+",平均="+(double)total/count);
	}

	//透過Switch case判斷
	private static void Testcase()
	{
		int score = 93;
		int level = (int)score/10;
		switch (level) 
		{
		case 10:
			System.out.println("滿分");
			break;
		case 9:
			System.out.println("九分!");
			break;
		case 8:
			System.out.println("八分!");
			break;
		case 7:
			System.out.println("七分!");
			break;
		default:
			System.out.println("!?!?");
			break;
		}
	}

	//透過XOR去做加密
	public static void encryption()
	{
		char ch = 'A'; System.out.println("編碼前:" + ch);
		System.out.println("原始二進位："+Integer.toBinaryString((byte)ch));
		String a = Integer.toBinaryString((byte)7);
		System.out.println(a);
		System.out.println("改的進位："+Integer.toBinaryString(ch^7));
		ch =(char)(ch^7); 
		System.out.println("編碼後:" + ch);
		ch =(char)(ch^7); 
		System.out.println("解碼:" + ch); 
	}
	
	//byte類型測試 加上~等於補數
	public static void bytetest()
	{
		byte A_num = 0;
		System.out.println(~A_num);
	}
	
	//數位邏輯運算AND,OR,XOR
	public static void bitwise()
	{
		System.out.println("AND運算：");
		System.out.println("0 AND 0 = "+(0 & 0));
		System.out.println("1 AND 0 = "+(1 & 0));
		System.out.println("0 AND 1 = "+(0 & 1));
		System.out.println("1 AND 1 = "+(1 & 1));
		
		System.out.println("OR運算：");
		System.out.println("0 OR 0 = "+(0 | 0));
		System.out.println("1 OR 0 = "+(1 | 0));
		System.out.println("0 OR 1 = "+(0 | 1));
		System.out.println("1 OR 1 = "+(1 | 1));
		
		System.out.println("XND運算：");
		System.out.println("0 XND 0 = "+(0 ^ 0));
		System.out.println("1 XND 0 = "+(1 ^ 0));
		System.out.println("0 XND 1 = "+(0 ^ 1));
		System.out.println("1 XND 1 = "+(1 ^ 1));
	}
	
	//if簡寫
	public static void if_fromt()
	{
		int StudentNum = 40;
		//將結果直接寫在out地方 (條件 ? 符合: 不符合)
		System.out.println("學生最終成績="+(StudentNum >= 60 ? "通過" :" 不通過"));
	}
	
	//變數轉型態
	public static void ass_DoubleToInt()
	{
		double d_num = 84.23;
		//當型態不同時 前面加上括弧資料類型將浮點轉為整數 否則會出錯
		int i_num = (int)d_num;
		System.out.println(i_num);
	}
	
	//宣告最後變數
	public static void ass_final()
	{
		final int testNum = 30;
		//testNum = 20; 這時候跳錯誤 因為已使用final
		System.out.println(testNum);
	}
	
	//宣告變數名稱
	public static void ass()
	{
		//不可為數字開頭或特殊字元
		//不可與預設名稱重複
		//開始時第一個字母使用大寫,例如:int ageOfStudent
		//私有變數(Private)通常可以使用底線作為開頭,例如:double _window_center_x;
		int ageOfStudent = 0;
		double _window_center_x = 0.0;
	}
	
	//個型態最大最小值
	public static void reage()
	{
		System.out.printf("short \t範圍：%d ~ %d\n",Short.MAX_VALUE,Short.MIN_VALUE);
		System.out.printf("int \t範圍：%d ~ %d\n",Integer.MAX_VALUE,Integer.MIN_VALUE);
		System.out.printf("long \t範圍：%d ~ %d\n",Long.MAX_VALUE,Long.MIN_VALUE);
		System.out.printf("byte \t範圍：%d ~ %d\n",Byte.MAX_VALUE,Byte.MIN_VALUE);
		System.out.printf("float \t範圍：%e ~ %e\n",Float.MAX_VALUE,Float.MIN_VALUE);
		System.out.printf("double \t範圍：%e ~ %e\n",Double.MAX_VALUE,Double.MIN_VALUE);
	}
}
