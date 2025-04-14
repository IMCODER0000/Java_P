package collection.array;

import java.util.Arrays;

public class MyArrayListV4<E> {

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV4() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    private MyArrayListV4(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size(){
        return size;
    }

    public void add(E e){

        if(size == elementData.length){
            grow();
        }

        elementData[size] = e;
        size++;
    }

    public void add(int index, E o) {
        if(size == elementData.length){
            grow();
        }
        shift(index, o);
        elementData[index] = o;

    }

    public void remove(){
        elementData[size-1] = null;
        size--;
    }

    public void remove(int index) {

        shiftLeft(index);
        size--;


    }

    private void shiftLeft(int index) {
        if(index == size-1){
            elementData[size-1] = null;
            return;
        }
        for ( int i = index; i< size-1; i ++ ){
            elementData[i] = elementData[i + 1];
        }
    }

    private void shift(int index, E o) {


        if (index == elementData.length) {
            grow();


        } else if (index == size) {

        } else if (index > size){


        } else{
            for(int i = size; i> index; i--){
                elementData[i] = elementData[i - 1];
            }

        }


        size++;
    }

    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;
        elementData = Arrays.copyOf(elementData, newCapacity);

    }

    @SuppressWarnings("unchecked")
    public E get(int index){
        return (E) elementData[index];
    }

    public E set(int index, E element) {
        E oldValue = get(index);
        elementData[index] = element;
        return oldValue;

    }

    public int indexOf(E o){
        for (int i = 0; i < size; i++) {
            if (o.equals(elementData[i])) {
                return i;
            }

        }
        return -1;
    }

    public String toString(){

        return Arrays.toString(Arrays.copyOf(elementData, size)) +
                " size = " + size + ", capacity = " + elementData.length;

    }



}
