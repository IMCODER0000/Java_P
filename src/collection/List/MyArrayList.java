package collection.List;

import java.util.Arrays;

public class MyArrayList<E> implements MyList<E> {

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayList() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    private MyArrayList(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    @Override
    public int size(){
        return size;
    }

    @Override
    public void add(E e){

        if(size == elementData.length){
            grow();
        }

        elementData[size] = e;
        size++;
    }
    @Override
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

    @Override
    public E remove(int index) {

        E removeElemnet = get(index);
        shiftLeft(index);
        size--;


        return removeElemnet;
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
    @Override
    public E get(int index){
        return (E) elementData[index];
    }

    @Override
    public E set(int index, E element) {
        E oldValue = get(index);
        elementData[index] = element;
        return oldValue;

    }

    @Override
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
