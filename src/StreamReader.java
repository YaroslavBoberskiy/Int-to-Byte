import java.io.ByteArrayInputStream;

/**
 * Created by YB on 27.01.2016.
 */
public class StreamReader {

    public void printStreamData (byte [] inStream) {
        ByteArrayInputStream bais = new ByteArrayInputStream(inStream);
        for (int i = 0; i < inStream.length; i ++) {
            System.out.println(bais.read());
        }
        }
    }


