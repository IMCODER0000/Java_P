package collection.array;

public class MyArrayListV3Main {

    public static void main(String[] args) {

        MyArrayListV3 list = new MyArrayListV3();
        System.out.println(list);
        System.out.println("==  데이터 추가 ===");
        list.add("1");
        System.out.println(list);
        list.add("2");
        System.out.println(list);
        list.add("3");
        System.out.println(list);
        list.add("4");
        System.out.println(list);

//        System.out.println("== 기능 사용 ===");
//        System.out.println("list.size() = " + list.size());
//        System.out.println("list.get(1) = " + list.get(1));
//        System.out.println("list.indexOf(\"c\") = " + list.indexOf("c"));
//        System.out.println("list.set(2, 'z') = " + list.set(2, 'z'));
//        System.out.println(list);

//
//        System.out.println("=== 범위 초과 ===");
        list.add("5");
        System.out.println(list);
        list.add("6");
        System.out.println(list);

        list.add(6 , "999");
        System.out.println(list);

//        list.remove();
//        System.out.println(list);

        list.remove(0);
        System.out.println(list);
        list.remove(6);
        System.out.println(list);



    }
}
