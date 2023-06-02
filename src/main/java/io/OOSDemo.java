package io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class OOSDemo  {
    public static void main(String[] args)throws Exception {
        String name = "王克晶";
        int age = 18;
        String gender = "女";
        String[] otherInfo = {"JAVA大佬","黑","技术好","贤妻良母","地球人"};
        Person p = new Person(name,age,gender,otherInfo);
        System.out.println(p);

        FileOutputStream fos = new FileOutputStream("person.");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(p);
        System.out.println("完毕");
        oos.close();


    }


}
