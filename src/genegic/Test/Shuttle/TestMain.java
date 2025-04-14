package genegic.Test.Shuttle;

import genegic.Test.Unit.Marine;
import genegic.Test.Unit.Zealot;

public class TestMain {

    public static void main(String[] args) {


        Shuttle<Marine> shuttle1 = new Shuttle<>();
        Shuttle<Zealot> shuttle2 = new Shuttle<>();

        shuttle1.in(new Marine("마린1", 100));
        shuttle1.in(new Marine("마린2", 200));
        shuttle1.in(new Marine("마린3", 300));
        shuttle1.in(new Marine("마린4", 200));
        shuttle1.in(new Marine("마린5", 700));
//        shuttle1.showInfo();
//
//        shuttle2.in(new Zealot("질럿1", 200));
//        shuttle2.showInfo();

        UnitPrinter.printV1(shuttle1);

        UnitPrinter.printV2(shuttle1);




    }

}
