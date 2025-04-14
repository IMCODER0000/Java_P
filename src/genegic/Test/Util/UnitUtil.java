package genegic.Test.Util;

import genegic.Test.Unit.BioUnit;

public class UnitUtil {

    public static <T extends BioUnit> T  MaxHP(T target1, T target2){
        if (target1.getHp() == target2.getHp()){
            return target1;
        }
        else{
            return target1.getHp() > target2.getHp() ? target1 : target2;
        }
    }


}
