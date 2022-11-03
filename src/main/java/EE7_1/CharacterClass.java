package EE7_1;

import java.util.List;
import java.util.TreeMap;

public abstract class CharacterClass implements DataElement{
    private String name;
    private List<String> perks;


    public void print(){
        System.out.println("Class: "+name);
        for(String perk: perks){
            System.out.println("\t"+perk);
        }
    }

    public TreeMap access(DataElementsVisitor vis) {
        return vis.visit(this);
    }
}