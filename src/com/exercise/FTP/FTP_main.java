package com.exercise.FTP;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.SftpException;

public class FTP_main
{
	public static void main(String[] args) throws Exception
	{
		Map<String, String> ftpDetails = new HashMap<String, String>();
	    //FTP連線參數
	    ftpDetails.put(FTPConstants.FTP_REQ_HOST, "127.0.0.1");
	    ftpDetails.put(FTPConstants.FTP_REQ_USERNAME, "Andy");
	    ftpDetails.put(FTPConstants.FTP_REQ_PASSWORD, "12388674");
	    ftpDetails.put(FTPConstants.FTP_REQ_PORT, "21");
	    
	    FTPFunction ftp = new FTPFunction();
	    ftp.Connect(ftpDetails);
	    ftp.View();
	    
	}
}
