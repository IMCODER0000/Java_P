package genegic.Test.Shuttle;

import genegic.Test.Unit.BioUnit;

import java.util.ArrayList;
import java.util.List;

public class Shuttle <T extends BioUnit>{

    private List<T> Units = new ArrayList<>();
    
    public void in(T t){
        Units.add(t);
        System.out.println("탑승완료");
    }
    
    public void showInfo(){

        for(T unit : Units){
            System.out.println(unit.getName());
        }
        
    }

    public List<T> getUnits() {
        return Units;
    }
}
