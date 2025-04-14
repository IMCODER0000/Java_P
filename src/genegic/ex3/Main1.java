package genegic.ex3;

import genegic.animal.Cat;
import genegic.animal.Dog;

public class Main1 {

    public static void main(String[] args) {

        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();
        Cat cat = new Cat("냥냥이", 4);
        Cat cat2 = new Cat("냥냥이2", 5);
        Dog dog = new Dog("초코", 3);
        Dog dog2 = new Dog("초코2", 33);

        catHospital.set(cat);
        catHospital.checkUp();

        dogHospital.set(dog);
        dogHospital.checkUp();


        Cat biggerCat = catHospital.bigger(cat2);
        Dog biggerDog = dogHospital.bigger(dog2);

        System.out.println("더 큰 고양이는 : " + biggerCat.getName());
        System.out.println("더 큰 강아지는 : " + biggerDog.getName());


    }



}
