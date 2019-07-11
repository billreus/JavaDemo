package HttpServer;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class HttpServer {
    public static void main(String[] args) {

        try {
            // 侦听8080端口
            ServerSocket server = new ServerSocket(8080);

            //System.out.println("Info:Server start," + DateFormatUtils.format(new Date(), "yyyy-MM-dd HH:mm:ss"));
            System.out.println("Info:Server start");
            while (1 == 1) {
                // 接收客户端请求数据
                Socket socket = server.accept();

                // 读取
                BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                // 写入
                BufferedWriter output = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

                String line = input.readLine();

                while (line != null) {
                    System.out.println(line);
                    //output.write("Success!!" + DateFormatUtils.format(new Date(), "yyyy-MM-dd HH:mm:ss") + "\r\n");
                    output.write("success");
                    output.flush();
                    line = input.readLine();
                    return;
                }
                //必须关闭
                input.close();
                output.close();

                socket.close();
            }
        } catch (IOException e) {
            System.out.println("Error binding the specified port.");
        }
    }
}
