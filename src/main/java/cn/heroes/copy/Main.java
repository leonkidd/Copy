package cn.heroes.copy;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(80);
		Socket socket = ss.accept();
		
		InputStream is = socket.getInputStream();
		int temp = -1;
		while((temp = is.read()) != -1) {
			System.out.println(String.valueOf(temp));
		}

		//		String url = "";
		//		HttpGet get = new HttpGet(url);
		//HttpClients.
	}

}
