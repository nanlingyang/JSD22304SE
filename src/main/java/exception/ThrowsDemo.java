package exception;

import java.awt.*;
import java.io.IOException;

public class ThrowsDemo {
    public void dosome()throws IOException, AWTException{}
}

class SubClass extends ThrowsDemo{
       // public void dosome()throws IOException, AWTException {}

 //   子类可以不再抛出任何异常
    //public void dosome(){}

//    子类可以仅抛出超类方法声明异常的部分异常
//    public void dosome()throws IOException {}

//    子类方法可以抛出超类方法声明抛出异常的子类型异常
//    public void dosome()throws FileNotFoundException {}

//    不允许抛出额外异常.超类方法没有声明的,且与声明的异常不存在继承关系的
//    public void dosome()throws SQLException {}

//    不允许抛出超类方法声明异常的超类型异常
//    public void dosome()throws Exception {}
}
