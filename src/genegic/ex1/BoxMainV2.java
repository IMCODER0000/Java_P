package genegic.ex1;

public class BoxMainV2 {

    public static void main(String[] args){


//        StringBox stringBox = new StringBox();
//        IntegerBox integerBox = new IntegerBox();


        ObjectBox objectBoxS = new ObjectBox();
        ObjectBox objectBoxI = new ObjectBox();

        ObjectBox objectBoxO = new ObjectBox();

        objectBoxO.set("sdsddss");

        objectBoxS.set("오브젝트 박스속 스트링");
        objectBoxI.set(1234);



        Integer i2 = (Integer) objectBoxO.get();

        String s = (String) objectBoxS.get();
        Integer i = (Integer) objectBoxI.get();




        System.out.println("스트링 = " + s);
        System.out.println("인티저 = " + i);
        System.out.print("뭔지 모름 = " + i2);










    }


}
