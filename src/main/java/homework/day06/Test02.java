package homework.day06;

import java.io.*;


/**
        * 将当前目录下的所有obj文件获取到，并进行
        * 反序列化后输出每个用户的信息(直接输出反序
        * 列化后的User对象即可)
        * @author Xiloer
        *
        */
public class Test02  {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
       //判断当前文件为目录文件
        File dir = new File(".");
        //获取所有店obj文件
        File[] subs = dir.listFiles((f)->f.getName().endsWith(".obj"));
        //循环遍历
        for(int i=0;i<subs.length;i++){
            File sub = subs[i];//从数组中获取每一个obj文件
            //读取obj文件
            FileInputStream fis = new FileInputStream(sub);
            ObjectInputStream ois = new ObjectInputStream(fis);
            //写入文件
            Object obj = ois.readObject();
           // User user = (User)obj;
            //判断左边对象是右边实例
            if(obj instanceof User){
                //是则输出user
                User user = (User)obj;
                System.out.println(user);
            }
            ois.close();
        }
    }
}
