import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class socket_client {

	public static void main(String[] args) 
	{
		try
		{
			Socket socket =new Socket("127.0.0.1",9999);
			System.out.println("連線成功");
			BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(socket.isConnected())
			{
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("客戶端輸入:");
				bw.write("客戶輸入:"+br.readLine()+"\n");
				bw.flush();
			}
			
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
