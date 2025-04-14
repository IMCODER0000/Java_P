package collection.link;

public class NodeMain3 {

    public static void main(String[] args) {


        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");
        first.next.next.next = new Node("D");

        System.out.println("모든 노드 출력");
//        System.out.println(first.toString());
        System.out.println(first);

        // 모든 노드 탐색
        printAll(first);

        // 마지막 노드 조회하기
        System.out.println();
        Node last = getLast(first);
        Node last2 = getLast2(first);
        System.out.println("마지막노드 : " + last);
        System.out.println("마지막노드2 : " + last2);

        // 특정 인덱스의 노드 조회하기
        System.out.println();
        int index = 3;
        Node nodeByIndex = getNodeByIndex(index, first);
        System.out.println(index + " 번째 인덱스의 값은 : " + nodeByIndex.item);


        // 데이터 추가하기
        System.out.println();
        add(first, "E");
        add(first, "F");
        add(first, "G");


    }

    private static void printAll(Node node) {

        Node x = node;
        while (x != null) {
            System.out.println(x.item);
            x = x.next;
        }


    }

    private static Node getLast(Node node) {
        Node x = node;
        while (x != null) {

            if (x.next == null) {
                return x;
            }

            x = x.next;
        }
        return x;

    }

    private static Node getLast2(Node node) {
        Node x = node;
        while (x.next != null) {
            x = x.next;
        }
        return x;

    }

    private static Node getNodeByIndex(int index, Node node) {
        Node x = node;
        // A
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    private static void add(Node node, String add) {

//        Node x = node;
//        while (x.next != null) {
//            x = x.next;
//        }
//        x.next = new Node(add);

        Node lastNode = getLast2(node);
        lastNode.next = new Node(add);


        System.out.println();
        System.out.println("추가 후 노드");
        System.out.println(node);
    }


}
