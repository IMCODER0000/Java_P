package genegic.ex1;

public class BoxMain {

    public static void main(String[] args) {


        GenericBox<Integer> integer = new GenericBox<Integer>();
        integer.set(10);
        Integer integer1 = integer.get();
        System.out.println("integer = " + integer1);

        GenericBox<String> string = new GenericBox<String>();
        string.set("hheelllloo");
        String str = string.get();
        System.out.println("string = " + str);

        GenericBox<Double> doubleBox = new GenericBox<Double>();
        doubleBox.set(3.14);
        Double doubleB = doubleBox.get();
        System.out.println("double = " + doubleB);




    }

}
