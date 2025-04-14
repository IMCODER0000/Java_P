package genegic.ex4;

import genegic.animal.Animal;

public class ComplexBox <T extends Animal>{

    public T animal;

    public void set(T t){
        System.out.println("동물의 크기 : " + t.getSize());
        System.out.println("동물의 크기 : " + t.getName());
        this.animal = t;
    }

    public <T> T printAndReturn(T t){
        System.out.println("animal.className : " + animal.getClass().getName());
        System.out.println("z.className : " + t.getClass().getName());
        return t;
    }


}
