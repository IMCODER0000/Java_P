package collection.link;

public class MyLinkedListV2Main {


    public static void main(String[] args) {

        MyLinkedListV2 list = new MyLinkedListV2();

        // 마지막에 추가 // O(n)

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println(list);

        // 첫 번째 항목에 추가, 삭제
        System.out.println();
        list.add(0, "Q");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);

        // 중간 항목에 추가, 삭제
        System.out.println();
        list.add(3,"Z");
        System.out.println(list);
        list.remove(3);
        System.out.println(list);

    }
}
