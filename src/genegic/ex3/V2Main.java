package genegic.ex3;

import genegic.animal.Animal;
import genegic.animal.Cat;
import genegic.animal.Dog;


public class V2Main {

    public static void main(String[] args){

        Dog dog = new Dog("멍멍이1", 3);
        Cat cat = new Cat("냥냥이1", 3);

        AnimalHospitalV2<Dog> dogAnimalHospitalV2 = new AnimalHospitalV2<>();

        dogAnimalHospitalV2.set(dog);

        Animal biggerDog = dogAnimalHospitalV2.bigger(new Dog("멍멍이2", 33));

        System.out.println("더 큰 동물은 : " + biggerDog.getName());
//        System.out.println("더 큰 동물은 : " + BiggerAnimal2);


    }
}
