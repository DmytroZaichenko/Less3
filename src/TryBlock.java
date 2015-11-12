import javax.swing.tree.ExpandVetoException;

/**
 * Created by DmitryZ on 11.11.2015.
 */
public class TryBlock {

    public static final int i = 0;
    public final double pi = 3.14;

    public static int doThisForMe(int a, int b) throws InterruptedException  {

        int c = a / b;
        Thread.sleep(100);
        return c;

    }

    public static void myExc() {
        throw new MyPersonalException("my exception");
    }
}
