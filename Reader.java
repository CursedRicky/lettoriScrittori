import java.io.BufferedReader;
import java.io.FileReader;

public class Reader extends Thread{
    @Override
    public synchronized void run() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
