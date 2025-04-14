package genegic.ex5;

public class Box<T> {

    public T value;

    public void set(T t){
        this.value = t;
    }


    public T get(){
        return value;
    }


}
