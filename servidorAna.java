import java.io.*;
import java.net.*;

public class servidorAna
{
PrintWriter writer;
	public void go(){
		try{
			ServerSocket serverSocket = new ServerSocket(4242);
			
			while(true){
				Socket sock = serverSocket.accept();
				
				writer = new PrintWriter(sock.getOutputStream());
				writer.println();		
			}
			}
			catch (IOException ex){
				ex.printStackTrace();
			}
			
	}
	public static void main(String[] args){
	servidorAna server = new servidorAna();
	server.go();		
	}
}