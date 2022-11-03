package EE7_1;

import netscape.javascript.JSObject;
import org.json.simple.JSONObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Demo {

    public static void main(String[] args) throws IOException {

        ElementVisitor visitor = new ElementVisitor();

        JSONObject jsonObject = new JSONObject();


        FileWriter file = new FileWriter("output.json");

        Character player = new Character("Thorin I \"Oakenshield\"",
                RaceFactory.getRace(new DwarfFactory(), "Hill Dwarf"));
            player.setAtributes(Stats.generate());
           player.addRaceBonuses();

        List<DataElement> list = new ArrayList<>();
        list.add(player);
        list.add(player.getRace());
        list.add(player.getAtributes());

        for (DataElement elem: list){
            jsonObject.putAll(elem.access(visitor));
        }

        file.write("[");
        file.write(jsonObject.toJSONString());
        list.clear();


        Character player2=new Character("Elf \"Poppy\"",
                RaceFactory.getRace(new HumenFactory(), "Human"));
        player2.setAtributes(Stats.generate());
        player2.addRaceBonuses();


        list.add(player2);
        list.add(player2.getRace());
        list.add(player2.getAtributes());

        for (DataElement elem: list){
            jsonObject.putAll(elem.access(visitor));
        }

        file.write(",");
        file.write(jsonObject.toJSONString());
        file.write("]");
        file.close();

    }
}
