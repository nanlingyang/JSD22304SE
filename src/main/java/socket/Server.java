package socket;

import java.io.*;
import java.net.ServerSocket;//1.向系统申请服务端口,客户端就是通过这个端口与服务器建立连接的
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * 聊天室服务端
 */
public class Server {
    private ServerSocket serverSocket;
    private List<PrintWriter> allOut = new ArrayList<>();
    public Server(){
        try {
            System.out.println("正在启动服务端...");
            serverSocket = new ServerSocket(8088);
            System.out.println("服务端启动完毕!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void start(){
        try {
            while(true){
            System.out.println("等待客户端连接...");
            Socket socket = serverSocket.accept();
            System.out.println("有个客户端连接了!");
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
                InputStreamReader isr = new InputStreamReader(in,StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);

                OutputStream out = socket.getOutputStream();
                OutputStreamWriter osw = new OutputStreamWriter(out,StandardCharsets.UTF_8);
                BufferedWriter bw = new BufferedWriter(osw);
                 pw = new PrintWriter(bw,true);
                synchronized (allOut) {
                    allOut.add(pw);
                }
                SendMessage(host+"上线了,当前在线人数:"+allOut.size());

                String message ;
                while((message = br.readLine())!=null){
                   SendMessage(host+":说:"+message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                synchronized (allOut) {
                    allOut.remove(pw);
                }
                SendMessage(host+"下线了,当前在线人数:"+allOut.size());
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
        private void SendMessage(String message){
            System.out.println(message);
            //allOut.forEach(e->e.println(host+"说:"+message));
            synchronized (allOut) {
                for (PrintWriter e : allOut) {
                    e.println(message);
                }
            }
        }
    }
}
