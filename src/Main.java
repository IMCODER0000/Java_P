import genegic.ex1.IntegerBox;
import genegic.ex1.ObjectBox;
import genegic.ex1.StringBox;

public class Main {
    public static void main(String[] args) {

//
//        IntegerBox integerBox = new IntegerBox();
//        integerBox.set(10);
//        Integer integer = integerBox.get();
//        System.out.println("integer = " + integer);
//
//
//        StringBox stringBox = new StringBox();
//        stringBox.set("hello");
//        String string = stringBox.get();
//        System.out.println("String = " + string);


        ObjectBox objectBox = new ObjectBox();
        objectBox.set(10);

        Integer o2 = (Integer) objectBox.get();


        System.out.println("Integer2 = " + o2.getClass().getName());


        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str = (String) stringBox.get();

        System.out.println("string2 = " + str);


    }
}