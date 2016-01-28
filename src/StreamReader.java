import java.io.ByteArrayInputStream;

/**
 * Created by YB on 27.01.2016.
 */
public class StreamReader {

    public void printStreamData (ByteArrayInputStream bais) {
        int i;
        while ((i=bais.read()) != -1) {
            System.out.println(i);
        }
        }
    }


