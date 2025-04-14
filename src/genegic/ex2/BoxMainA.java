package genegic.ex2;

import genegic.animal.Animal;
import genegic.animal.Cat;
import genegic.animal.Dog;

public class BoxMainA {

    public static void main(String[] args) {

        Animal sample = new Animal("동물", 0);
        Dog dog = new Dog("강아지", 100);
        Cat cat = new Cat("냐옹이", 200);

        Box<Dog> dogBox = new Box<>();
        dogBox.set(dog);
        Dog dog1 = dogBox.get();
        System.out.println("dog1 = " + dog1);


        Box<Cat> catBox = new Box<>();
        catBox.set(cat);
        Cat cat1 = catBox.get();
        System.out.println("cat1 = " + cat1);

        Box<Animal> animalBox = new Box<>();
        animalBox.set(sample);
        Animal animal = animalBox.get();
        System.out.println("animal = " + animal);


    }
}
