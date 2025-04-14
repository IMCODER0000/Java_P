package genegic.ex4;

public class MMain {

    public static void main(String[] args){


        Integer i = 10;


        Integer i1 = GenericMethod.<Integer>genericMethod(i);
        Object o = GenericMethod.objectMethod(i);
        Double v = GenericMethod.genericEXMethod(2.2);


    }

}
