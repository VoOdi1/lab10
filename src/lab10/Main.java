package lab10;


public class Main {
    public static void main(String[] aars) {
        System.setProperty("console.encoding","Cp866");
        lab10 met1 = new lab10();
        met1.function0();
        met1.function1();
        met1.function2(1);
        met1.function2(2);
        met1.function2(3);


        ExceptoinDemo to_exc  = new ExceptoinDemo();
        try {
            to_exc.function3(1);
            to_exc.function3(20);
        } catch (to_exc  e) {
            System.out.println("Исключение to_exc: " + e.toString());
            System.out.println("Исключение to_exc: " + e.getMassage());
        }
    }
    }