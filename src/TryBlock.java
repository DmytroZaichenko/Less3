import javax.swing.tree.ExpandVetoException;

/**
 * Created by DmitryZ on 11.11.2015.
 */
public class TryBlock {

    public static void main(String[] args){

        try {
            //TryBlock.doThisForMe(2,0);
            myExc();
        }catch (MyPersonalException e){
            System.out.println(e.getMessage());
        }catch (ArithmeticException e){
            System.out.println("my by zero");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("print all the time");
        }

    }

    public static int doThisForMe(int a, int b) throws MyPersonalException{

        int c = a / b;

        return c;

    }

    public static void myExc() throws MyPersonalException{
        throw new MyPersonalException("my exception");
    }
}
