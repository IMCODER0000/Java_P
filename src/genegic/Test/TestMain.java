package genegic.Test;

import genegic.Test.Unit.Marine;
import genegic.Test.Unit.Zealot;
import genegic.Test.Util.UnitUtil;

public class TestMain {

    public static void main(String[] args){

        Marine marine1 = new Marine("마린1", 10000);
        Marine marine2 = new Marine("마린2", 3000000);

        Marine HigherHP_Marine = UnitUtil.MaxHP(marine1, marine2);

        Zealot zealot1 = new Zealot("질럿1", 200);
        Zealot zealot2 = new Zealot("질럿2", 20220);

        Zealot HigherHP_Zealot = UnitUtil.MaxHP(zealot1, zealot2);


        System.out.println("Higher HP Marine - " + HigherHP_Marine);
        System.out.println("Higher HP Zealot - " + HigherHP_Zealot);


    }

}
