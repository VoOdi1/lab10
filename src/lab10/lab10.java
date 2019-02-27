package lab10;

public class lab10 {

    void function0(){
        System.setProperty("console.encoding","Cp866");
        System.out.println("1-Деление на ноль");
        try {
            int d = 0;
            int s = 120 / d;
        }catch (ArithmeticException e){
            System.out.println("Исключение: " + e);
        }
    }
    void  function1(){
        System.setProperty("console.encoding","Cp866");
        System.out.println("Запрос переменной за пределы массива");
        try {
            int mas[]={1,2,3,4,5,6};
            System.out.println(mas[8]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Исключение: " + e.getMessage());
        }
    }
    void function2(int a) {
        System.setProperty("console.encoding","Cp866");
        System.out.println("разнотипные исключения");
        try {
            switch (a) {
                case 1:
                    throw new NullPointerException();
                case 2:
                    throw new NoSuchFieldException();
                case 3:
                    throw new ArrayIndexOutOfBoundsException();
            }
        }
        catch (ArrayIndexOutOfBoundsException | NoSuchFieldException | NullPointerException e) {
            System.out.println("Исключение" + e.toString());
        }

    }
}
