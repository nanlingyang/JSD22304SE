package io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class OISDemo {

    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("person.obj");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Person person  = (Person) ois.readObject();
        System.out.println(person);
        ois.close();

    }
}
