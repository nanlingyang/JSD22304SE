package object;

public class TestPoint {
    public static void main(String[] args) {
        Point p  =new Point(1,2);

        System.out.println(p);
        //System.out.println(p.toString());
        String line = "当前对象是："+p;
        System.out.println(line);


        Point p2 = new Point(1,2);
        System.out.println("p2:"+p2);
        System.out.println(p==p2);
        System.out.println(p.equals(p2));
    }
}
