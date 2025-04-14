package collection.List;

public class MyListPerformanceTest {

    public static void main(String[] args) {

        int size = 50_000;
        System.out.println("=== MyArrayList 추가 ===");
        addFisrt(new MyArrayList<>(), size); // 찾는데 O(1), 데이터 추가(밀기) O(n)
        addMid(new MyArrayList<>(), size); // 찾는데 O(1), 데이터 추가(밀기) O(n)

        MyArrayList<Integer> arrayList = new MyArrayList<>();
        addLast(arrayList, size); // 찾는데 O(1), 데이터 추가 O(1)

        System.out.println();
        System.out.println("=== MyArrayList 조회 ===");
        int loop = 10000;
        getIndex(arrayList, loop, 0);
        getIndex(arrayList, loop, size/2);
        getIndex(arrayList, loop, size-1);
        System.out.println();
        System.out.println("=== MyArrayList 검색 ===");
        search(arrayList, loop, 0);
        search(arrayList, loop, size/2);
        search(arrayList, loop, size-1);



        System.out.println();
        System.out.println("=== MyLinkedList 추가 ===");
        addFisrt(new MyLinkedList<>(), size); // 찾는데 O(1), 데이터 추가 O(1)
        addMid(new MyLinkedList<>(), size); // 찾는데 O(n), 데이터 추가 O(1)

        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        addLast(linkedList, size); // 찾는데 O(n), 데이터 추가 O(1)

        System.out.println();
        System.out.println("=== MyLinkedList 조회 ===");
        getIndex(linkedList, loop, 0);
        getIndex(linkedList, loop, size/2);
        getIndex(linkedList, loop, size-1);
        System.out.println();
        System.out.println("=== MyLinkedList 검색 ===");
        search(linkedList, loop, 0);
        search(linkedList, loop, size/2);
        search(linkedList, loop, size-1);





    }

    private static void addFisrt(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();

        System.out.println("크기 : " + size + ", 계산 시간 : " + (endTime - startTime) + "ms");

    }

    private static void addMid(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i/2, i);
        }
        long endTime = System.currentTimeMillis();

        System.out.println("평균 크기 : " + size + ", 계산 시간 : " + (endTime - startTime) + "ms");

    }

    private static void addLast(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();

        System.out.println("마지막 크기 : " + size + ", 계산 시간 : " + (endTime - startTime) + "ms");

    }

    private static void getIndex(MyList<Integer> list, int loop, int index) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.get(index);
        }
        long endTime = System.currentTimeMillis();

        System.out.println("index : " + index + ", 반복 : " + loop + ", 반복 시간 : " + (endTime - startTime) + "ms");

    }

    private static void search(MyList<Integer> list, int loop, int value) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.indexOf(value);
        }
        long endTime = System.currentTimeMillis();

        System.out.println("value : " + value + ", 반복 : " + loop + ", 반복 시간 : " + (endTime - startTime) + "ms");

    }

}
