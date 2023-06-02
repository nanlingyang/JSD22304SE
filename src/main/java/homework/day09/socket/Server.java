package homework.day09.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Server {
    private ServerSocket serverSocket;
    private List<PrintWriter> allOut = new ArrayList<>();
    public Server(){
        try {
            System.out.println("正在启动服务端...");
            serverSocket = new ServerSocket(8888);
            System.out.println("服务器启动完毕!");
        } catch (NullPointerException | IOException e) {
            e.printStackTrace();
        }
    }
    public void start(){
        try {
            System.out.println("等待客户端连接...");
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("一个客户端连接了!");
                ClientHandler handler = new ClientHandler(socket);
                Thread t = new Thread(handler);
                t.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }

    private class ClientHandler implements Runnable{
        private Socket socket;
        private String host;

        public ClientHandler(Socket socket){
            this.socket = socket;
            host = socket.getInetAddress().getHostAddress();
        }
        public void run(){
            PrintWriter pw = null;
            try {
                InputStream in = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(in, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);

                OutputStream out = socket.getOutputStream();
                OutputStreamWriter osw = new OutputStreamWriter(out,StandardCharsets.UTF_8);
                BufferedWriter bw = new BufferedWriter(osw);
                pw = new PrintWriter(bw,true);
                synchronized (allOut) {
                    allOut.add(pw);
                }
                sendMessage(host+"上线了,当前在线人数:"+allOut.size());

                String message;
                while ((message=br.readLine())!=null){
                    sendMessage(host+"说:"+message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                synchronized (allOut) {
                    allOut.remove(pw);
                }

                sendMessage(host + "下线了,当前在线人数" + allOut.size());
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
        private void sendMessage(String message){
            System.out.println(message);
            synchronized (allOut) {
                for (PrintWriter e : allOut) {
                    e.println(message);
                }
            }
        }
    }
}
