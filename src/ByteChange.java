import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class ByteChange 
{
	public static void main(String[] args) throws UnsupportedEncodingException 
	{
		String a= "你好";
		try
		{
			//將a用Big5編碼,用ISO-8859-1解碼
			System.out.println(new String(a.getBytes("Big5"), "ISO-8859-1"));
			//a getbyte後 記憶體位置
			System.out.println(a.getBytes("Big5"));
			//直接將a(預設utf8)轉big5
			System.out.println(new String(a.getBytes(), "big5"));
			//將a用big5編碼,big5解碼
			System.out.println(new String(a.getBytes("Big5"), "Big5"));
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
