package HttpServer;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatClient {
    public static void main(String[] args)throws IOException {
        System.out.println("客户端运行中...");
        try(
            Socket socket=new Socket("127.0.0.1", 8080);
            DataInputStream inputStream=new DataInputStream(socket.getInputStream());
            DataOutputStream outputStream=new DataOutputStream(socket.getOutputStream());
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in))
        ){
            while(true) {
                String aString=bufferedReader.readLine();
                if(aString.equals("bye"))break;
                outputStream.writeUTF(aString);
                outputStream.flush();

                String iString=inputStream.readUTF();
                System.out.println(iString);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("客户端停止");
    }
}
