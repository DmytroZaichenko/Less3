package exception;

/**
 * Created by admin on 11.11.2015.
 */
public class Demo {

    public static void main(String[] args) {
        A a = new Demo.A();
        B b = new Demo.B();

        B link = b;
        link.a();

        if (link instanceof B){
            ((B) link).b();
//        B link2 = (B) link;
//        link2.b();
        }else{
            System.out.println("c");
        }



    }

    static class A{
        void a(){

        }
    }

    static class B extends A{
        void b() {
            System.out.println("B");
        }
    }
}
