package genegic.ex5;

import genegic.animal.Cat;
import genegic.animal.Dog;

public class Wmain {
    public static void main(String[] args) {
        Box<Object> objectBox = new Box<>();
        Box<Dog> dogtBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogtBox.set(new Dog("멍멍이", 3));

        WildcardEx.printGenericV1(dogtBox);


        WildcardEx.printWildcardV1(dogtBox);

        WildcardEx.printGenericV2(dogtBox);

        Dog dog = WildcardEx.printAndReturnGeneric(dogtBox);
        System.out.println("dog = " + dog);

    }
}
