package collection.List;

public class MyLinkedList<E> implements MyList<E> {

    private Node<E> first;
    private int size = 0;


    public void add(int index, E o) {

        Node<E> newNode = new Node<>(o);

        if (index == 0) {
            newNode.next = first;
            first = newNode;
        }
        else{
            Node<E> prevNode = getNode(index - 1);

            newNode.next = prevNode.next;
            prevNode.next = newNode;
        }
        size++;

    }


    public void add(E o) {
        Node<E> newNode = new Node<>(o);

        if (first == null) {
            first = newNode;
        }
        else{
            Node<E> lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;

    }

    public E remove(int index) {
        Node<E> removeNode = getNode(index);
        E removeObject = removeNode.item;


        if (index == 0) {
            first = removeNode.next;

        }
        else{
            Node<E> prevNode = getNode(index-1);
            prevNode.next =  removeNode.next;

        }

        removeNode.next = null;
        removeNode.item = null;
        size --;
        return removeObject;




    }




    public Node<E> getLastNode() {

        Node<E> x = first;
        while (x.next != null){
            x = x.next;
        }
        return x;
    }

    public E set(int index, E o) {

        Node<E> node = getNode(index);
        E oldValue = node.item;
        node.item = o;
        return oldValue;

    }

    public E get(int index){

        Node<E> item = getNode(index);
        return item.item;


    }

    private Node<E> getNode(int index) {

        Node<E> x = first;
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

    public int indexOf(E o) {
        int index = 0;
        for (Node<E> x = first; x != null; x = x.next) {
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


    private static class Node<E> {

        E item;
        Node<E> next;

        public Node(E item) {
            this.item = item;
        }

        @Override
        public String toString() {

            StringBuilder sb = new StringBuilder();
            Node<E> x = this;
            sb.append("[");

            while (x != null) {

                sb.append(x.item);
                if(x.next != null){
                    sb.append(" -> ");
                }
                x = x.next;

            }

            sb.append("]");

            return sb.toString();
        }


    }



}
