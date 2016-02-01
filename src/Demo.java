import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) {

        StreamReader sr = new StreamReader();
        String pathToFile = "C:" + File.separator + "temp1" + File.separator + "temp2" + File.separator + "javainfo.txt";
        File javaInfo = new File(pathToFile);

        if (javaInfo.exists() && javaInfo.isFile()) {
            try {
                FileInputStream fis = new FileInputStream(javaInfo);
                    sr.printStreamData(fis);
                    fis.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
