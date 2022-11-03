package EE7_1;

public class Humen extends CharacterRace{


    Humen(String name,Stats stat){
        this.name=name;
        this.bonuses=stat;
    }

    @Override
    public void saySMITH() {
        System.out.println("Avada Kedavra");
    }
}
