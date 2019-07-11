package HttpServer;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
    public static void main(String[] args)throws IOException{
        System.out.println("服务器运行中...");
        try(ServerSocket serverSocket = new ServerSocket(8080);
            Socket socket=serverSocket.accept();
            DataInputStream inputStream=new DataInputStream(socket.getInputStream());
            DataOutputStream outputStream=new DataOutputStream(socket.getOutputStream());
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in))
        ){
            while(true) {
                String iString = inputStream.readUTF();//读取信息要放在最前面，以读取客户端发来的信息
                System.out.println(iString);
                String aString = bufferedReader.readLine();
                if (aString.equals("bye")) break;

                //写入输出流
                outputStream.writeUTF(aString);
                //将输出流刷新
                outputStream.flush();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("服务器停止");
    }
}
