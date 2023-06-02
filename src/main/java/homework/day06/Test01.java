package homework.day06;



import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入你的信息:姓名,密码,昵称,年龄");
        String name = scan.nextLine();
        String pwd = scan.nextLine();
        String nick = scan.nextLine();
        int age = scan.nextInt();
        User u = new User(name,pwd,nick,age);
        System.out.println(u);
        FileOutputStream fos = new FileOutputStream(name+".obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(u);
        System.out.println("写出完毕");
        oos.close();

    }
}
