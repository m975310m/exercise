import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class socket_service {
	public static void main(String[] args) 
	{
		try  
		{
			String num_Rex = "[//d]*";
			ServerSocket serverSocket = new ServerSocket(9999);
			Socket socket = serverSocket.accept();
			System.out.println("連線成功");
			while(socket.isConnected())
			{
				BufferedReader br =new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String str = br.readLine();
				if(str==null)
				{
					break;
				}
				System.out.println(str);
			}
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
