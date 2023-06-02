package homework.day08.socket;

import java.io.*;

import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Client {
    private Socket socket;
    public Client(){
        try {
            System.out.println("正在连接服务器...");
            socket = new Socket("localhost",8808);
            System.out.println("与服务器建立连接...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void start(){
        try {
            OutputStream out = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(out, StandardCharsets.UTF_8);
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw);
            Scanner scan = new Scanner(System.in);
            while(true){
                String message = scan.nextLine();
                if("exit".equalsIgnoreCase(message)){
                    break;
                }
                pw.println(message);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                socket.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }
}

