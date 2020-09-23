package com.exercise.FTP;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;

public class FTPFunction
{
	static FTPClient ftp = new FTPClient();
	
	public static void Connect(Map<String, String> ftpDetails)
	{
        String ftpHost = ftpDetails.get(FTPConstants.FTP_REQ_HOST);
        String port = ftpDetails.get(FTPConstants.FTP_REQ_PORT);
        String ftpUserName = ftpDetails.get(FTPConstants.FTP_REQ_USERNAME);
        String ftpPassword = ftpDetails.get(FTPConstants.FTP_REQ_PASSWORD);
		try 
		{
			//連線 RtnCode:220 = 連線成功
			ftp.connect(ftpHost,Integer.valueOf(port));
			System.out.println("ftp_連線回傳=="+ftp.getReplyCode());
			
			//使用者登入
			ftp.login(ftpUserName,ftpPassword);
			System.out.println("ftp_用戶登入=="+ftp.getReplyCode());
			
			//如果回傳是錯誤代碼
			if (!FTPReply.isPositiveCompletion(ftp.getReplyCode())) 
			{
				ftp.disconnect();
				System.err.println("FTP拒絕連接!");
				System.exit(1);
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void View() throws IOException
	{
		String[] names = ftp.listNames();
		System.out.println(ftp.getLocalPort());
		System.out.println(ftp.printWorkingDirectory());
		for (String file_name : names) 
		{
			System.out.println(file_name);
		}
	}
}
