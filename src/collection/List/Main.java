package collection.List;

public class Main {

    public static void main(String[] args) {

        BatchProcessor batchProcessor = new BatchProcessor(new MyArrayList<Integer>());
        BatchProcessor batchProcessor2 = new BatchProcessor(new MyLinkedList<Integer>());
//

        batchProcessor2.logic(100_00000);

//        batchProcessor.logic(100_000);




    }



}
