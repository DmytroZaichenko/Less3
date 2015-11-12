
public class Demo {

    public static void main(String[] args) {
//        try {
//            //TryBlock.doThisForMe(2,0);
//            TryBlock.myExc();
////        }catch (MyPersonalException e){
////            System.out.println(e.getMessage());
////        }catch (ArithmeticException e){
////            System.out.println("my by zero");
////        }catch (Exception e){
////            e.printStackTrace();
//        }finally {
//            System.out.println("print all the time");
//        }

        TryBlock.myExc();

        //TryBlock.doThisForMe(3,0);
        try {
            TryBlock.doThisForMe(3,0);
        }catch (ArithmeticException | IllegalArgumentException e){
            System.out.println("devide on zero");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int k = TryBlock.i;
        TryBlock l = new TryBlock();

        A a = new A();
        B b = new B();

        A link = b;
        try {
           ((B) link).b();
        }catch (ClassCastException e){
            link.a();
        }

        ((B)link).b();

//        if (link instanceof B){
//            ((B)link).b();
//        }

    }

    static class A{
        void a(){
            System.out.println("A");
        }
    }

    static class B extends A{
        void b() {
            System.out.println("B");
        }
    }


}
