package EE7_1;

import java.util.HashMap;

public class DwarfFactory implements RaceAbstractFactory{
    HashMap<String,Stats> dwarfTypes=new HashMap<>();

    @Override
    public Dwarf create(String type) {
        if(dwarfTypes.isEmpty()){
            dwarfTypes.put("Hill Dwarf", new Stats(0,0,2,0,1,0));
        }
        return new Dwarf(type,dwarfTypes.get(type));
    }

}
