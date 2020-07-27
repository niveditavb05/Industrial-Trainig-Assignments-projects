import java.net.*;
import java.io.*;

public class Server extends Thread {
    public void run()
{ 
        String clientSentence;
        String cap_Sentence;
        ServerSocket my_Socket = new ServerSocket(2343);

        while(true) {
            Socket connectionSocket = my_Socket.accept();
            BufferedReader in = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
            DataOutputStream out = new DataOutputStream(connectionSocket.getOutputStream());
            clientSentence = in.readLine();
            cap_Sentence = "Raceived:" +  clientSentence + '\n';
            out.writeBytes(cap_Sentence);
        }
}
public static void main(String args[]) throws Exception {
Server s1=new Server ();
s1.start();
    }
}