package genegic.Matter1;

public class MainM {

    public static void main(String[] args) {

        Container<String> stringContainer = new Container<>();
        System.out.println("빈 값 확인1 = " + stringContainer.isEmpty());

        stringContainer.set("data1");
        System.out.println("저장 데이터 = " + stringContainer.get());
        System.out.println("빈갑 확인2 = " + stringContainer.isEmpty());

        Container<Integer> integerContainer = new Container<>();
        integerContainer.set(10);
        System.out.println("저장 데이터 = " + integerContainer.get());
    }
}
