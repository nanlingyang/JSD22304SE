package socket;

import java.io.*;
import java.net.Socket;//套接字,该类封装了TCP协议的通讯细节,我们使用它可以与远端计算机建立连接并进行可靠的传输通讯
import java.nio.charset.StandardCharsets;
import java.util.Scanner;


/**
 * 聊天室客户端
 */
public class Client {
    private Socket socket;

    public Client() {
        try {
            System.out.println("正在连接服务端...");
            socket = new Socket("176.46.100.89"
                    , 8088);
            System.out.println("与服务端建立连接...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void start() {
        try {
            ServerHandler handler = new ServerHandler();
            Thread t = new Thread(handler);
            t.setDaemon(true);
            t.start();
            OutputStream out = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(out,StandardCharsets.UTF_8);
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw,true);

            Scanner scan = new Scanner(System.in);
            while(true){
                String message = scan.nextLine();
                if ("exit".equalsIgnoreCase(message)) {
                    break;
                }
                pw.println(message);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
        public static void main(String[] args){
            Client client = new Client();//实例化客户端
            client.start();//启动客户端
    }

    private class ServerHandler implements Runnable{
        public void run(){
            try {
                InputStream in = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(in,StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);
                String message;
                while ((message = br.readLine())!=null){
                    System.out.println(message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}