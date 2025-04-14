package genegic.ex3;

import genegic.animal.Animal;

public class AnimalHospitalV3<T extends Animal> {


    private T animal;


    public void set(T animal){
        this.animal = animal;
        System.out.println("animal = " + animal);
    }

//    public T get(){
//        return animal;
//    }



}
