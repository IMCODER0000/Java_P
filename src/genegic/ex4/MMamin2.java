package genegic.ex4;

import genegic.animal.Animal;
import genegic.animal.Cat;
import genegic.animal.Dog;

public class MMamin2 {

    public static void main(String[] args){


        Dog dog = new Dog("멍멍이1", 20);
        Dog dog2 = new Dog("멍멍이2", 10);
        Cat cat = new Cat("냥냥이1", 33);
        Cat cat2 = new Cat("냥냥이2", 100);

        AnimalMethod.CheckUp(cat);

        Dog biggerDog = AnimalMethod.bigger(dog, dog2);
        System.out.print("더 큰 동물은 : " + biggerDog.getName());


    }

}
