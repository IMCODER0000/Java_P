package genegic.ex2;

import genegic.animal.Animal;
import genegic.animal.Cat;
import genegic.animal.Dog;

public class BoxAnimal {

    public static void main(String[] args) {

        Animal animal = new Animal("동물", 0);
        Dog dog = new Dog("멍멍이", 1);
        Cat cat = new Cat("냐옹이", 2);

        Box<Animal> animalBox = new Box<>();
        animalBox.set(animal);
        animalBox.set(dog);
        animalBox.set(cat);



    }

}
