package genegic.Test.Shuttle;

import genegic.Test.Unit.BioUnit;

import java.util.List;

public class UnitPrinter {


    public static <T extends BioUnit> void printV1(Shuttle<T> shuttle){

        List<T> Units = shuttle.getUnits();

        System.out.println("------------- 탑승자 명단 --------------");
        System.out.println();
        for(T unit : Units){
            System.out.println("이름 : " + unit.getName());
            System.out.println("HP : " + unit.getHp());
            System.out.println();
        }
        System.out.println("--------------------------------------");

    }

    public static void printV2(Shuttle<? extends BioUnit> shuttle) {

        List<? extends BioUnit> Units = shuttle.getUnits();

        System.out.println("------------- 탑승자 명단2 --------------");
        System.out.println();
        for(BioUnit unit : Units){
            System.out.println("이름 : " + unit.getName());
            System.out.println("HP : " + unit.getHp());
            System.out.println();
        }
        System.out.println("--------------------------------------");

    }


}
