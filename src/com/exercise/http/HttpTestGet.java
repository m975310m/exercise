package com.exercise.http;
import java.io.IOException;
import javax.xml.ws.Response;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.omg.CORBA.RepositoryIdHelper;
import com.sun.jna.platform.FileUtils;

public class HttpTestGet 
{
	public static void main(String[] args) throws IOException
	{	
		response();
		

	}
	private static void response() throws IOException 
	{
		// TODO Auto-generated method stub
		// 创建Httpclient对象
		DefaultHttpClient httpclient = new DefaultHttpClient();
		//创建http GET请求
		
		HttpGet httpGet = new HttpGet("https://www.google.com/search?q=YAHOO&oq=YAHOO&aqs=chrome.0.69i59j0l4j69i60l3.1016j0j7&sourceid=chrome&ie=UTF-8");
		HttpResponse response;
		response = httpclient.execute(httpGet);
		System.out.println(response.getStatusLine().getStatusCode());
		HttpEntity entity = response.getEntity();
		String Ans = EntityUtils.toString(entity,"UTF-8");
		System.out.println(Ans);
	}
}
