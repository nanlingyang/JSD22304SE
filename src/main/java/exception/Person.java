package exception;

public class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age)throws Exception {
       if(age<0||age>100){
           //throw new Exception("年龄不合法");
           throw new IllegalAgeException("年龄范围:"+age);
       }
        this.age = age;
    }
}
