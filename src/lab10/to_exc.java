package lab10;

public class to_exc  extends Exception {
    private int detail;
    to_exc(int a){
        detail = a;
        }
    public String toString(){
        System.setProperty("console.encoding","Cp866");
        return "to_exc[" + detail + "]";
        }
        public String getMassage(){
        System.setProperty("console.encoding","Cp866");
        return "значение (a) больше 10";
        }
    }


class ExceptoinDemo{
    static void function3(int a) throws  to_exc {
        System.setProperty("console.encoding","Cp866");
        System.out.println("Исключение собственного класса");
        System.out.println("Названипе метода to_exc(" +a+ ")");
        if(a>10)
            throw new to_exc(a);
        System.out.println("Нормальное завершение");
    }
}
