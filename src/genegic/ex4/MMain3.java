package genegic.ex4;

import genegic.animal.Cat;
import genegic.animal.Dog;

public class MMain3 {

    public static void main(String[] args){


        Dog dog = new Dog("멍멍이1", 133);
        Dog dog2 = new Dog("멍멍이1", 22);
        Cat cat = new Cat("냥냥이1", 222);


        ComplexBox<Dog> complexBox = new ComplexBox<>();

        complexBox.set(dog);
        Cat cat1 = complexBox.<Cat>printAndReturn(cat);


    }

}
