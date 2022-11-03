package EE7_1;

import java.util.TreeMap;

public class ElementVisitor implements DataElementsVisitor{
    public TreeMap visit (Character ch){
        TreeMap jobj = new TreeMap();
        jobj.put("Name",ch.getName());
        jobj.put("HP", ch.getAtributes());
        return jobj;
    }

    public TreeMap visit (CharacterClass cl){
        TreeMap jobj = new TreeMap();
        jobj.put("Name",cl.toString());
        return jobj;
    }

    public TreeMap visit(CharacterRace cr){
        TreeMap jobj = new TreeMap();
        jobj.put("Race", cr.toString());
        return jobj;
    }

    public TreeMap visit (Stats st){
        TreeMap jobs = new TreeMap();
        jobs.put("Atributes", st.getAttrib());
        return jobs;
    }
}
