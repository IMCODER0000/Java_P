package collection.link;

public class NodeMain1 {

    public static void main(String[] args) {

        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println("모든 노드 탐색");
//        System.out.println("first.item = " + first.item);
//        System.out.println("first.next = " + first.next.item);
//        System.out.println("first.next.next = " + first.next.next.item);

        Node x = first;
        while (x != null) {
            System.out.println("Node = " + x.item);
            x = x.next;
        }


    }

}
