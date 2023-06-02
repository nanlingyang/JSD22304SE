package reflect;

public class Person {
    private String  name = "张三";
    private int age = 22;
    public Person(){}
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void sayHello(){
        System.out.println(name+":hello!");
    }
    public void sanHi(){
        System.out.println(name+":hi!");
    }
    public void sleep(){
        System.out.println(name+"在睡觉!");
    }
    public void watchTv(){
        System.out.println(name+":在看电视!");
    }
    public void playGame(){
        System.out.println(name+"玩游戏!");
    }
    public void say(String info){
        System.out.println(name+":"+info);
    }
    public void say(String info,int count){
        for (int i = 0; i < count; i++) {
            System.out.println(name+":"+info);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
