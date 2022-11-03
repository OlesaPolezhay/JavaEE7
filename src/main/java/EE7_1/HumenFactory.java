package EE7_1;

import java.util.HashMap;

public class HumenFactory implements RaceAbstractFactory{

    HashMap<String,Stats> humenTypes=new HashMap<>();


    public Humen create(String type) {
        if(humenTypes.isEmpty()){
            humenTypes.put("Human", new Stats(1,1,1,1,1,1));
        }
        return new Humen(type,humenTypes.get(type));
    }
}

