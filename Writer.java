import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Writer extends Thread{

    @Override
    public void run() {
        System.out.println("A");
        try {
            FileWriter fw = new FileWriter("file.txt");
            Random r = new Random();
            int test = r.nextInt(1,10);
            System.out.println(test);
            fw.write(String.valueOf(test));
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
