package homework.day09.socket;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Client {
    private Socket socket;
    public Client(){
        try {
            System.out.println("正在连接服务器...");
            socket = new Socket("176.46.100.112",8088);
            System.out.println("与服务器建立连接...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void start(){
        try {
            ServerHandler handler = new ServerHandler();
            Thread t = new Thread(handler);
            t.setDaemon(true);
            t.start();
            OutputStream out = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(out, StandardCharsets.UTF_8);
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw,true);

            Scanner scanner = new Scanner(System.in);
            while(true){
                String message = scanner.nextLine();
                if("exie".equalsIgnoreCase(message)){
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

    private class ServerHandler implements Runnable{
        public void run(){
            try {
                InputStream in = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(in,StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);
                String message;
                while ((message=br.readLine())!=null){
                    System.out.println(message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }

}
