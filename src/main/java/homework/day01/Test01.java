package homework.day01;

public class Test01 {
    public static void main(String[] args) {
        String fileName1 = "logo.png";
        String fileName2 = "jquery.1.2.js";

        String ext = getExtByName(fileName1);
        System.out.println(ext);
        String ext2 = getExtByName(fileName2);
        System.out.println(ext2);
    }
    public static String getExtByName(String name){
        int startIndex = name.lastIndexOf(".")+1;
        int endIndex = name.length();


        return name.substring(startIndex,endIndex);

    }
}
