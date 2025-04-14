package collection.link;

public class MyLinkedListV3Main {
    public static void main(String[] args) {

        MyLinkedListV3<String> stringList = new MyLinkedListV3<>();
        stringList.add("A");
        stringList.add("B");
        stringList.add("C");
        stringList.add("D");

        String result = stringList.get(0);

        System.out.println(result);
        System.out.println(stringList);

        MyLinkedListV3<Integer> intList = new MyLinkedListV3<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);

        Integer result2 = intList.get(0);
        System.out.println(result2);
        System.out.println(intList);
        
    }
}
