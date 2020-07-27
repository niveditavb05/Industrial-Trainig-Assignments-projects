import java.io.*;  
import java.net.*;  
public class MyClient extends Thread {  
public void run()
{ 
try
{ 
Socket s=new Socket("localhost", 6666);  
DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
dout.writeUTF("Hello Server");  
dout.flush();  
dout.close();  
s.close(); 
} 
catch(Exception e){System.out.println(e);}  
 }
public static void main(String[] args) {  
MyClient m1=new MyClient();
m1.start();
} 
} 