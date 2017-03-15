package chap06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
* @author liudaohao
* @version 创建时间：2016年12月4日 下午3:49:18
*/
public class MyClient {

	 public static void main(String[] args) throws Exception {  
	        Socket socket = new Socket("192.168.1.100", 8888); 
	        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));  
	        PrintWriter out = new PrintWriter(socket.getOutputStream());  
	        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));  
	  
	        while (true) {
	            String msg = reader.readLine();  
	            out.println(msg);
	            out.flush();
	            if (msg.equals("bye")) {  
	                break;  
	            }  
	            System.out.println(in.readLine());  
	        }  
	        socket.close();  
	    }  
}
