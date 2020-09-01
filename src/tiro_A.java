public class tiro_A 
{
	//public 開放:其他類別可以使用訪問
	//static 宣告為靜態函式,唯一值的概念
	//void 不回傳數值
	//main 規定方法
	//(String[] args) 宣告傳入字串陣列 以args為參數名
	public static void main(String[] args) 
	{	
		//將命令列進行編譯,迴圈印出
		for(String msg:args)
		{	
			System.out.println(msg);
		}
	}
	
}
