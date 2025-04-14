package genegic.ex5;

import genegic.animal.Animal;

public class WildcardEx {

    static <T> void printGenericV1(Box<T> box){
        System.out.println("Generic T = " + box.get());
    }

    static <T> void printWildcardV1(Box<?> box){
        System.out.println("Wildcard T = " + box.get());
    }

    static <T extends Animal> void printGenericV2(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
    }

    static <T extends Animal> T printAndReturnGeneric(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
        return t;
    }


}

