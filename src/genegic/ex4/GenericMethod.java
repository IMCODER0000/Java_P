package genegic.ex4;

public class GenericMethod {

    public static Object objectMethod(Object obj){
        System.out.println("Object print : " + obj);
        return obj;
    }


    public static <T> T genericMethod(T t){
        System.out.println("Generic print : " + t);
        return t;
    }

    public static <T extends Number> T genericEXMethod(T t){
        System.out.println("bound print : " + t);
        return t;
    }


}
