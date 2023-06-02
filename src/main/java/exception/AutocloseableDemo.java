package exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class AutocloseableDemo {
    public static void main(String[] args) {
        try(
                FileOutputStream fos = new FileOutputStream("fos.dat");
                ){
            fos.write(1);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
