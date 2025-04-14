package collection.link;

import Q.Phone;

public class MyLinkedListV1 {

    private Node first;
    private int size = 0;


    public void add(Object o) {
        Node newNode = new Node(o);

        if (first == null) {
            first = newNode;
        }
        else{
            Node lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;

    }

    public Node getLastNode() {

        Node x = first;
        while (x.next != null){
            x = x.next;
        }
        return x;
    }

    public Object set(int index, Object o) {

        Node node = getNode(index);
        Object oldValue = node.item;
        node.item = o;
        return oldValue;

    }

    public Object get(int index){
        return getNode(index).item;
    }

    private Node getNode(int index) {

        Node x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }


        return x;
    }

//    public int indexOf(Object o){
//
//        int index = 0;
//        Node x = first;
//        while (x != null) {
//            if (x.item.equals(o)) {
//                break;
//            }
//            x = x.next;
//            index++;
//        }
//        return index;
//
//    }

    public int indexOf(Object o) {
        int index = 0;
        for (Node x = first; x != null; x = x.next) {
            if (x.item.equals(o)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public int size() {
        return size;
    }


    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }
}
