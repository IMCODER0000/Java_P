package collection.array;

public class MyArrayListV4Main {

    public static void main(String[] args) {


        MyArrayListV4<String> stringList = new MyArrayListV4<>();
        stringList.add("A");
        stringList.add("B");
        stringList.add("C");
        stringList.add("D");
        System.out.println(stringList);


        MyArrayListV4<Integer> integerList = new MyArrayListV4<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);

        System.out.println(integerList);
    }
}
