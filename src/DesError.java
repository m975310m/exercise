import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class DesError 
{
	//NoSuchMethodError --> JVM找尋不到使用方法
	//NullPointerException --> 為定義變數初始值
	//ClassNotFoundException --> 找不到指定Class
	//FileNotFoundException --> 當試圖打開指定路徑名表示的檔案失敗時，拋出此異常
	//ArrayIndexOutOfBoundsException --> 用非法索引存取陣列時拋出的異常。如果索引為負或大於等於陣列大小，則該索引為非法索引
	//NumberFormatException --> 當應用程序試圖將字元串轉換成一種數值型別，但該字元串不能轉換為適當格式時，拋出該異常
	//IOException --> 當發生某種 I/O 異常時，拋出此異常。此類別是失敗或中斷的 I/O 操作產生的異常的通用類別
	//ClassCastException --> 當試圖將物件強制轉換為不是實例的子類別時，拋出該異常
	//ClassFormatException --> 
	//StringIndexOutOfBoundsException --> 此異常由 String 方法拋出，指示索引或者為負，或者超出字元串的大小。對諸如 charAt 的一些方法，當索引等於字元串的大小時，也會拋出該異常
	
	public static void main(String[] args)
	{
		//NullPointerException
		//		String word = null;
		//		System.out.println(word.equals("haha"));
		
		//ClassNotFoundException
		//		Question q = new Question();
		//		try 
		//		{
		//			System.out.println(Class.forName("Question"));
		//		}
		//		catch(ClassNotFoundException e)
		//		{
		//			e.printStackTrace();
		//		}
		
		//FileNotFoundException
		//		try 
		//		{
		//			FileReader fr = new FileReader(".\\ource\\file.txt");
		//		} 
		//		catch(FileNotFoundException e) 
		//		{
		//			// TODO Auto-generated catch block
		//			e.printStackTrace();
		//		}
		
		//ArrayIndexOutOfBoundsException
		//		int[] a = new int[3];
		//		a[3] = 3;
		
		//NumberFormatException
		//		String str = "100A";
		//		int num = 500 + Integer.valueOf(str);
		
		//IOException
		//		File f = new File("//source//file.txt");
		//		try 
		//		{
		//			f.createNewFile();
		//		}
		//		catch (IOException e) 
		//		{
		//			// TODO Auto-generated catch block
		//			e.printStackTrace();
		//		}
		
		//ClassCastException
		//	    Object x = new Integer(0);
		//	    System.out.println((String)x);
		
		//ClassFormatException
		
		
		//StringIndexOutOfBoundsException
		//		String str = "ABCD";
		//		System.out.println(str.charAt(4));
	}
}