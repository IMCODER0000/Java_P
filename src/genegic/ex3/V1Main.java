package genegic.ex3;

import genegic.animal.Animal;
import genegic.animal.Cat;
import genegic.animal.Dog;



public class V1Main {

    public static void main(String[] args){

        AnimalHospitalV1 dogHospitalV1_1 = new AnimalHospitalV1();
        AnimalHospitalV1 catHospitalV1_2 = new AnimalHospitalV1();
        Dog dog = new Dog("똘똘이", 22);
        Cat cat = new Cat("냥냥이",11);

        dogHospitalV1_1.set(cat);
        catHospitalV1_2.set(cat);

        dogHospitalV1_1.checkUp();
        catHospitalV1_2.checkUp();

        dogHospitalV1_1.set(cat);

        Dog BiggerAnimal = (Dog) dogHospitalV1_1.bigger(new Dog("멍멍이", 90));
        Animal BiggerAnimal2 = catHospitalV1_2.bigger(new Cat("냥법사", 11));

        System.out.println("더 큰 동물은 : " + BiggerAnimal);
        System.out.println("더 큰 동물은 : " + BiggerAnimal2);


    }
}
