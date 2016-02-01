import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by YB on 27.01.2016.
 */
public class StreamReader {

    public void printStreamData (FileInputStream fis) {
        if (fis != null) {
            int available = -1;
            try {
                while ((available = fis.available()) > 0) {
                    int readByte = fis.read();
                    System.out.print((char)readByte);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    }


