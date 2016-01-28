/**
 *
 *
 *
 * Created by YB on 27.01.2016.
 */
public class Demo {
    public static void main(String[] args) {
        byte [] barr = {127, -64, 127, 0, -11, 45, 78};
        StreamReader ibc = new StreamReader();
        ibc.printStreamData(barr);
    }
}
