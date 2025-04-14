package genegic.ex1;

public class BoxMainV1 {

    public static void main(String[] args){


        StringBox stringBox = new StringBox();
        IntegerBox integerBox = new IntegerBox();
        stringBox.set("스트링박스 1");
        integerBox.set(123);

        Integer i = integerBox.get();
        String s = stringBox.get();

        System.out.println("스트링 박스1 = " + s);
        System.out.println("인티저 박스1 = " + i);




    }


}
